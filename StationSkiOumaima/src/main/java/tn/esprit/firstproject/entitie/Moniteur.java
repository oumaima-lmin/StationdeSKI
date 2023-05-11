package tn.esprit.firstproject.entitie;

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
public class Moniteur implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numMoniteur;
private String nomMoniteur;
private String prenomMoniteur;
private LocalDate DateRecru;
@OneToMany(cascade = CascadeType.ALL)
private Set<Cours> cours;

}
