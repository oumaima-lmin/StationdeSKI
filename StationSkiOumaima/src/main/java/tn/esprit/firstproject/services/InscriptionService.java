package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entitie.Inscription;
import tn.esprit.firstproject.entitie.Piste;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface InscriptionService {
    List<Inscription> retrieveAllInscri();
    Inscription AddInscri(Inscription inscription);
    void removeInscri(Long numInscri);
    Inscription retrieveInscri(Long numInscri);
    Inscription assignInscriToCours(Long idInscri,Long idCours);
    Inscription assignInscriToSkieur(Inscription inscription, Long idSkieur);
}
