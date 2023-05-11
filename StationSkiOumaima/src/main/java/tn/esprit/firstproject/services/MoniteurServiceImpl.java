package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Moniteur;
import tn.esprit.firstproject.repositories.CoursRepository;
import tn.esprit.firstproject.repositories.MoniteurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class MoniteurServiceImpl implements MoniteurService{
    private MoniteurRepository moniteurRepository;
    private final CoursRepository coursRepository;


    @Override
    public List<Moniteur> retrieveAllMOniteur() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur AddMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
     moniteurRepository.deleteById(numMoniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }

    @Override
    public void assignMoniteurToCours(Long idMoniteur, Long idCours) {
        Moniteur moniteur=moniteurRepository.findById(idMoniteur).orElse(null);
        Cours cours=coursRepository.findById(idCours).orElse(null);
        if(moniteur.getCours()==null){
            Set<Cours> coursSet= new HashSet<>();
            coursSet.add(cours);
            moniteur.setCours(coursSet);
        }
        else{
            moniteur.getCours().add(cours);
        }
        moniteurRepository.save(moniteur);
    }
}
