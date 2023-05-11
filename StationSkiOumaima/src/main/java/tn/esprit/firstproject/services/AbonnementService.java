package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entitie.Abonnement;
import tn.esprit.firstproject.entitie.TypeAbonnement;


import java.util.List;

public interface AbonnementService {
    List<Abonnement> retrieveAllAbo();
    Abonnement AddAbo(Abonnement abonnement);
    void removeAbo(Long numAbo);
    Abonnement retrieveAbo(Long numAbo);
    List<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);
}
