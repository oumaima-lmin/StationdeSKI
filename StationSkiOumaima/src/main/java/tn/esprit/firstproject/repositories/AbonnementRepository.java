package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entitie.Abonnement;
import tn.esprit.firstproject.entitie.TypeAbonnement;

import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
List<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);

}