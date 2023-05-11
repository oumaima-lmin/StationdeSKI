package tn.esprit.firstproject.entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inscription implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num_inscription;
    private int numSemaine;
    @ManyToOne
    @JsonIgnore
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
