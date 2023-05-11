package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entitie.Cours;
import tn.esprit.firstproject.entitie.Typecours;
import tn.esprit.firstproject.services.CoursService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursRestController {
    private CoursService coursService;
    @PostMapping("/add")
    Cours AddCours(@RequestBody Cours cours){
        return coursService.AddCours(cours);
    }
    @GetMapping("/all")
    List<Cours> retrieveAllCours(){
        return coursService.retrieveAllCours();
    }
    @GetMapping("/get/{id}")
    Cours retrieveCours(@PathVariable("id") long IdCours){
        return coursService.retrieveCours(IdCours);
    }
    @DeleteMapping("/delete/{id}")
    void RemoveCours(@PathVariable("id") long IdCours){
        coursService.removeCours(IdCours);
    }
    @GetMapping("/gett/{type}")
    List<Cours> retrieveCourseByType(@PathVariable("type") Typecours typecours){
        return coursService.retrieveCourseByType(typecours);
    }
     @GetMapping("/gettt/{type}")
    List<Cours> retrieveCourseByTypee(@PathVariable("type") Typecours type){
        return coursService.retrieveCourseByTypee(type);
    }
}
