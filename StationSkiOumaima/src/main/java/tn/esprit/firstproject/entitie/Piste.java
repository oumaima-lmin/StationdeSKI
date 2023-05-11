package tn.esprit.firstproject.entitie;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
private String nomPiste;
private int longueur;
private int perte;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    @ManyToMany
    @JsonIgnore
    private Set<Skieur> skieurSet;

}
