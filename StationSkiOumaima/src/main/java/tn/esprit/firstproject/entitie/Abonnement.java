package tn.esprit.firstproject.entitie;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;
    private LocalDate datedebut;
    private LocalDate datefin;
    private float prix;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbonnement;
   /* @OneToOne(mappedBy = "abonnement")//child
    private Skieur skieur;*/
}
