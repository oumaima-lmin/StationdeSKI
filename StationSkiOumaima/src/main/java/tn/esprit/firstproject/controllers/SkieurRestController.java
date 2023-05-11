package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.entitie.TypeAbonnement;
import tn.esprit.firstproject.services.SkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurRestController {
    private SkieurService skieurService;
    @PostMapping("/add")
    Skieur AddSkieur(@RequestBody Skieur skieur){
        return skieurService.AddSkieur(skieur);
    }
    @GetMapping("/all")
    List<Skieur> retrieveAllSkieur(){
        return skieurService.retrieveAllSkieur();
    }
    @GetMapping("/get/{id}")
    Skieur retrieveSkieur(@PathVariable("id") long IdSkieur){
        return skieurService.retrieveSkieur(IdSkieur);
    }
    @DeleteMapping("/delete/{id}")
    void RemoveSkieur(@PathVariable("id") long IdSkieur){
       skieurService.removeSkieur(IdSkieur);
    }
    @PutMapping("/assignSkiertoCours/{id}")
    public Skieur addskierandassigntocoure(@RequestBody Skieur skieur, @PathVariable("id") long numcours){
        return skieurService.addskierandassigntocoure(skieur,numcours);
    }
    @GetMapping("/getSkierbytypeabonnement/{type}")
    List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable("type") TypeAbonnement typeAbonnement) {
        return skieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }
    @Scheduled(fixedRate =60000)
    void retrieveSubscription(){
      Skieur skieur=  skieurService.prevusdans7jours();
      System.out.print("num abonnement:"+skieur.getAbonnement().getNumAbon()+"nom skieur:"+skieur.getNomS()+"prenom skieur:"+skieur.getPrenomS());
    }

}
