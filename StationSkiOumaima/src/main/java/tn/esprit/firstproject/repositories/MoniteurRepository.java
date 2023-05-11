package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entitie.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}