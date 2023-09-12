package canerakin.vetapp.demo.business.abstracts;

import canerakin.vetapp.demo.business.models.responses.GetAllAnimalResponse;
import canerakin.vetapp.demo.entities.concretes.Animal;

import java.util.List;

public interface AnimalService {


    List<GetAllAnimalResponse> getAll();


}
