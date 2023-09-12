package canerakin.vetapp.demo.webApi.controllers;

//CONTROLLER > SERVICE > MANAGER > REPORSITORY


import canerakin.vetapp.demo.business.abstracts.AnimalTypeService;
import canerakin.vetapp.demo.business.models.requests.CreateAnimalTypeRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateAnimalTypeRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalTypeResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdAnimalTypeResponse;
import canerakin.vetapp.demo.entities.concretes.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CONTROLLER > SERVICE > MANAGER > REPOSITORY

@RestController
@RequestMapping("/api/animalType")
public class AnimalTypeController {

    public AnimalTypeService animalTypeService;

    @Autowired
    public AnimalTypeController(AnimalTypeService animalTypeService) {
        this.animalTypeService = animalTypeService;
    }

    @GetMapping("/getAll")
    public List<GetAllAnimalTypeResponse> getAll() {
        return animalTypeService.getAll();

    }

    @GetMapping("/getById")
    public GetByIdAnimalTypeResponse getById(@RequestParam int id) {
        return animalTypeService.getById(id);

    }

    @PostMapping("/add")
    public void add(@RequestBody CreateAnimalTypeRequest createAnimalTypeRequest) {
        this.animalTypeService.add(createAnimalTypeRequest);

    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateAnimalTypeRequest updateAnimalTypeRequest) {

        this.animalTypeService.update(updateAnimalTypeRequest);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this.animalTypeService.delete(id);
    }
}


