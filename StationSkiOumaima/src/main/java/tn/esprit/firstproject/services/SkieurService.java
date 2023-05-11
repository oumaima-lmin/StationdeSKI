package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.entitie.TypeAbonnement;

import java.util.List;

public interface SkieurService {
    List<Skieur> retrieveAllSkieur();
    Skieur AddSkieur(Skieur skieur);
    void removeSkieur(Long numskieur);
    Skieur retrieveSkieur(Long numSkieur);
    Skieur addskierandassigntocoure(Skieur skieur,long numcours);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    Skieur prevusdans7jours();
}
