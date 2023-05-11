package tn.esprit.firstproject.services;
import tn.esprit.firstproject.entitie.Piste;
import java.util.List;
public interface IPisteServices {
    List<Piste> retrieveAllPistes();
    Piste AddPiste(Piste piste);
    void removePiste(Long numPiste);
    Piste retrievePiste(Long numPiste);
    Piste assignPisteToSkieur(Long idPiste, Long idSkieur);
}
