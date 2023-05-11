package tn.esprit.firstproject.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Moniteur;
import tn.esprit.firstproject.entitie.Piste;
import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.repositories.IPisteRepository;
import tn.esprit.firstproject.repositories.SkieurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class PisteServicesImpl implements IPisteServices{

    private IPisteRepository pisteRepository;
    private final SkieurRepository skieurRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste AddPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void removePiste(Long numPiste) {
       pisteRepository.deleteById(numPiste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public Piste assignPisteToSkieur(Long idPiste, Long idSkieur) {
        Piste piste=pisteRepository.findById(idPiste).orElse(null);
        Skieur skieur=skieurRepository.findById(idSkieur).orElse(null);
        if(piste.getSkieurSet()==null){
            Set<Skieur> Skieurs= new HashSet<>();
            Skieurs.add(skieur);
            piste.setSkieurSet(Skieurs);
        }
        else{
            piste.getSkieurSet().add(skieur);
        }
    return  pisteRepository.save(piste);
    }

}
