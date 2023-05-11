package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entitie.Abonnement;
import tn.esprit.firstproject.entitie.TypeAbonnement;
import tn.esprit.firstproject.services.AbonnementService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/abonnement")
public class AbonnementRestController {
    private AbonnementService abonnementService;
    @PostMapping("/add")
    Abonnement AddAbo(@RequestBody Abonnement abonnement){
        return abonnementService.AddAbo(abonnement);
    }
    @GetMapping("/all")
    List<Abonnement> retrieveAllAbo(){
        return abonnementService.retrieveAllAbo();
    }
    @GetMapping("/get/{id}")
    Abonnement retrieveAbo(@PathVariable("id") long IdAbo){
        return abonnementService.retrieveAbo(IdAbo);
    }
    @DeleteMapping("/delete/{id}")
    void RemoveAbo(@PathVariable("id") long IdAbo){
        abonnementService.removeAbo(IdAbo);
    }
    @GetMapping("/getAbonnementbytype")
    List<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement){
        return abonnementService.findByTypeAbonnement(typeAbonnement);
    }

}
