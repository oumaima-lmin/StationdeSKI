package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.entitie.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
    List<Skieur> findByAbonnement_TypeAbonnement(TypeAbonnement typeAbonnement);

}