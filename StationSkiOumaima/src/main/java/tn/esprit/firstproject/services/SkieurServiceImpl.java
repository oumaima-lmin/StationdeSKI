package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entitie.*;
import tn.esprit.firstproject.repositories.AbonnementRepository;
import tn.esprit.firstproject.repositories.CoursRepository;
import tn.esprit.firstproject.repositories.InscriptionRepository;
import tn.esprit.firstproject.repositories.SkieurRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImpl implements  SkieurService{
private SkieurRepository skieurRepository;
    private  InscriptionRepository inscriptionRepository;
    private final AbonnementRepository abonnementRepository;
    private final CoursRepository coursRepository;

    @Override
    public List<Skieur> retrieveAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    @Transactional //eviter les exceptions lors de l'ajout
    public Skieur AddSkieur(Skieur skieur) {
      /* //Je récupére l'abonnement que j'ai ajouté au niveau de skieur (get)
        Abonnement abonnement=skieur.getAbonnement();
        //ajouter l'abonnement récupéré au  niveau de la bdd Abonnement (methode save)
        abonnementRepository.save(abonnement);
        //remplir l'attribut abonnement de skieur
        skieur.setAbonnement(abonnement);*/
        return skieurRepository.save(skieur);
    }

    @Override
    @Transactional
    public void removeSkieur(Long numskieur) {
    /*  //je vais récupérer le skieur en tant qu'objet
        Skieur skieur = skieurRepository.findById(numskieur).orElse(null);
        //je recupére l'attribut abonnement du skieur que j'ai récupéré
        Abonnement abonnement=skieur.getAbonnement();
        //je supprime l'abonnement
        abonnementRepository.delete(abonnement);*/
     skieurRepository.deleteById(numskieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur addskierandassigntocoure(Skieur skieur, long numcours) {
        Cours cours=coursRepository.findById(numcours).orElse(null);
        skieur.setAbonnement(skieur.getAbonnement());
        skieur.setInscriptions(skieur.getInscriptions());
        cours.setInscriptions(skieur.getInscriptions());
        return skieurRepository.save(skieur);

    }
    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
        return skieurRepository.findByAbonnement_TypeAbonnement(typeAbonnement);
    }
    @Override
    public Skieur prevusdans7jours() {
        //List<Abonnement> abonnements=abonnementRepository.findAll();
        List<Skieur> skieurs =skieurRepository.findAll();
        LocalDate datefin=LocalDate.now();
        int date= datefin.getDayOfMonth()+7;
        for(int i=0;i<skieurs.size();i++){
            if(skieurs.get(i).getAbonnement().getDatefin().getDayOfMonth()==date){
                return skieurs.get(i);
            }
        }
        return null;
    }

}
