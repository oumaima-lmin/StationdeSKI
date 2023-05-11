package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.firstproject.entitie.Inscription;
import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.entitie.TypeAbonnement;
import tn.esprit.firstproject.entitie.Typecours;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {


   /* List<Inscription> findByCoursTypecours(Typecours typecours);

    List<Inscription> findBySkieur_Abonnement_TypeAbonnement(TypeAbonnement typeAbonnement);

    List<Inscription> findBySkieurAndSkieur_Abonnement_TypeAbonnementOrderByNum_inscriptionAsc(Skieur skieur, TypeAbonnement typeAbonnement);

    @Query("select i from Inscription i " +
            "where i.skieur = ?1 and i.skieur.abonnement.typeAbonnement = ?2 " +
            "order by i.num_inscription DESC")
    List<Inscription> findBySkieurAndSkieur_Abonnement_TypeAbonnementOrderByNum_inscriptionDesc(Skieur skieur, TypeAbonnement typeAbonnement);
*/


}