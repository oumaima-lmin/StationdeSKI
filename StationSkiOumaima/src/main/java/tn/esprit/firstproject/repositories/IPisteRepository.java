package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entitie.Piste;

public interface IPisteRepository extends JpaRepository<Piste,Long> {

}
