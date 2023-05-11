package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Typecours;

import java.util.List;

public interface CoursService {
    List<Cours> retrieveAllCours();
    Cours AddCours(Cours cours);
    void removeCours(Long numCours);
    Cours retrieveCours(Long numCours);
    List<Cours> retrieveCourseByType(Typecours type);
    List<Cours> retrieveCourseByTypee(Typecours type);

}
