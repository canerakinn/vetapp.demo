package canerakin.vetapp.demo.webApi.controllers;

import canerakin.vetapp.demo.business.abstracts.AnimalService;
import canerakin.vetapp.demo.business.models.requests.CreateAnimalRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateAnimalRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdAnimalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// CONTROLLER > SERVICE > MANAGER > REPOSITORY

@RestController
@RequestMapping(("/api/animal"))
@CrossOrigin
public class AnimalController {

    AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    ;


    @GetMapping("/getAll")
    public List<GetAllAnimalResponse> getAll() {
        return animalService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateAnimalRequest createAnimalRequest) {
        this.animalService.add(createAnimalRequest);
    }

    @PutMapping("update")
    public void update(@RequestBody UpdateAnimalRequest updateAnimalRequest) {
        this.animalService.update(updateAnimalRequest);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        this.animalService.delete(id);
    }

    @GetMapping("/getById")

    public GetByIdAnimalResponse getById(int id) {
        return this.animalService.getById(id);
    }


}
