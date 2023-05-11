package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Typecours;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {
  //recherche des cours par type en utilisant des requétes JPQL
     @Query("select c from Cours c where c.typecours = :type ")
    List<Cours> retrieveCourseByType(@Param("type") Typecours type);
     //recherche des cours sans les requétes
    List<Cours> findByTypecours(Typecours typecours);



}