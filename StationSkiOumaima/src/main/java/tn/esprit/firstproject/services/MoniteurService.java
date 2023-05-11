package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entitie.Moniteur;


import java.util.List;

public interface MoniteurService {
    List<Moniteur> retrieveAllMOniteur();
    Moniteur AddMoniteur(Moniteur moniteur);
    void removeMoniteur(Long numMoniteur);
    Moniteur retrieveMoniteur(Long numMoniteur);
    void assignMoniteurToCours(Long idMoniteur,Long idCours);
}
