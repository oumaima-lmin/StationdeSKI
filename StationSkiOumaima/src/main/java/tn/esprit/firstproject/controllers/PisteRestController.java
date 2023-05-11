package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entitie.Piste;
import tn.esprit.firstproject.services.IPisteServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/piste")
public class PisteRestController {
    private IPisteServices IPisteservices;
    @PostMapping("/add")
    Piste AddPiste(@RequestBody Piste piste){
        return IPisteservices.AddPiste(piste);
    }
    @GetMapping("/all")
    List<Piste> retrieveAllPistes(){
        return IPisteservices.retrieveAllPistes();
    }
    @GetMapping("/get/{id}")
    Piste retrievePiste(@PathVariable("id") long IdPiste){
        return IPisteservices.retrievePiste(IdPiste);
    }
    @DeleteMapping("/delete/{id}")
    void RemovePiste(@PathVariable("id") long IdPiste){
        IPisteservices.removePiste(IdPiste);
    }
    @PutMapping("/assignPisteToSkieur/{idPiste}/{idSkieur}")
    Piste assignPisteToSkieur(@PathVariable("idPiste") Long idPiste,@PathVariable("idSkieur") Long idSkieur){
      return  IPisteservices.assignPisteToSkieur(idPiste,idSkieur);
    }
}

