package canerakin.vetapp.demo.business.abstracts;

import canerakin.vetapp.demo.business.models.requests.CreateAnimalTypeRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateAnimalTypeRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalTypeResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdAnimalTypeResponse;
import canerakin.vetapp.demo.entities.concretes.AnimalType;

import java.util.List;

public interface AnimalTypeService {


    List<GetAllAnimalTypeResponse> getAll();

    void add(CreateAnimalTypeRequest createAnimalTypeRequest);

    void update(UpdateAnimalTypeRequest updateAnimalTypeRequest);

    void delete(int id);

    GetByIdAnimalTypeResponse getById(int id);

}
