package canerakin.vetapp.demo.webApi.controllers;


import canerakin.vetapp.demo.business.abstracts.AnimalService;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// CONTROLLER > SERVICE > MANAGER > REPOSITORY

@RestController
@RequestMapping(("/api/animal"))
@CrossOrigin
public class AnimalController {

    AnimalService animalService;

    @Autowired
    public AnimalController( AnimalService animalService){
        this.animalService = animalService;
    };


    @GetMapping("/getAll")
    public List<GetAllAnimalResponse> getAll(){
        return animalService.getAll();}





    

}
