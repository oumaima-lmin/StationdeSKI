package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Typecours;
import tn.esprit.firstproject.repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursServiceImpl implements CoursService {
    private CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours AddCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void removeCours(Long numCours) {
       coursRepository.deleteById(numCours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public List<Cours> retrieveCourseByType(Typecours type) {
        return coursRepository.findByTypecours(type);
    }
    @Override
    public List<Cours> retrieveCourseByTypee(Typecours type){
        return coursRepository.retrieveCourseByType(type);
    }
}
