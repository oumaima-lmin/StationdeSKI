package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entitie.Moniteur;
import tn.esprit.firstproject.services.MoniteurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurRestController {
    private MoniteurService moniteurService;
    @PostMapping("/add")
    Moniteur AddMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.AddMoniteur(moniteur);
    }
    @GetMapping("/all")
    List<Moniteur> retrieveAllMoniteur(){
        return moniteurService.retrieveAllMOniteur();
    }
    @GetMapping("/get/{id}")
    Moniteur retrieveMoniteur(@PathVariable("id") long IdMoniteur){
        return moniteurService.retrieveMoniteur(IdMoniteur);
    }
    @DeleteMapping("/delete/{id}")
    void removeMoniteur(@PathVariable("id") long IdMoniteur){
        moniteurService.removeMoniteur(IdMoniteur);
    }
    @PutMapping("/assignMoniToCour/{idMoni}/{idCours}")
    void assignMoniteurToCours(@PathVariable("idMoni") Long idMoniteur,@PathVariable("idCours") Long idCours){
        moniteurService.assignMoniteurToCours(idMoniteur,idCours);
    }
}
