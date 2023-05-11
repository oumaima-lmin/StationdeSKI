package tn.esprit.firstproject.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entitie.Inscription;
import tn.esprit.firstproject.services.InscriptionService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inscription")
public class InscriptionRestController {
    private InscriptionService inscriptionService;
    @PostMapping("/add")
    Inscription AddInscri(@RequestBody Inscription inscription){
        return inscriptionService.AddInscri(inscription);}
    @GetMapping("/all")
    List<Inscription> retrieveAllInscription(){
        return inscriptionService.retrieveAllInscri();
    }
    @GetMapping("/get/{id}")
    Inscription retrieveInscription (@PathVariable("id") long IdInscri){
        return inscriptionService.retrieveInscri(IdInscri);
    }
    @DeleteMapping("/delete/{id}")
    void removeInscri(@PathVariable("id") long IdInscri){
        inscriptionService.removeInscri(IdInscri);
    }
    @PostMapping("/addandassign/{id}")
    Inscription assignInscriToSkieur(@RequestBody Inscription inscription,@PathVariable("id") Long idSkieur){
    return    inscriptionService.assignInscriToSkieur(inscription,idSkieur);
}
}
