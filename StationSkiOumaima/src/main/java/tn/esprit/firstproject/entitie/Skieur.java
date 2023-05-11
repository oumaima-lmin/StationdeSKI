package tn.esprit.firstproject.entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate datenaissance;
    private String ville;
    //relation unidirectionnelle (pas de visibilité sur Abonnement)
@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Abonnement abonnement;
@OneToMany(mappedBy = "skieur")
@JsonIgnore
    private Set<Inscription> inscriptions;
@ManyToMany(mappedBy = "skieurSet")
    private Set<Piste> pistes;
}
