package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Inscription;
import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.repositories.CoursRepository;
import tn.esprit.firstproject.repositories.InscriptionRepository;
import tn.esprit.firstproject.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements InscriptionService{
    private  InscriptionRepository inscriptionRepository;
    private  CoursRepository coursRepository;
    private  SkieurRepository skieurRepository;

    @Override
    public List<Inscription> retrieveAllInscri() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription AddInscri(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void removeInscri(Long numInscri) {
       inscriptionRepository.deleteById(numInscri);
    }

    @Override
    public Inscription retrieveInscri(Long numInscri) {
        return inscriptionRepository.findById(numInscri).orElse(null);
    }

    @Override
    public Inscription assignInscriToCours(Long idInscri, Long idCours) {
        Inscription inscription=inscriptionRepository.findById(idInscri).orElse(null);
        Cours cours=coursRepository.findById(idCours).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription assignInscriToSkieur(Inscription inscription , Long idSkieur) {
       // Inscription inscription=inscriptionRepository.findById(idInscri).orElse(null);
        Skieur skieur=skieurRepository.findById(idSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }
}
