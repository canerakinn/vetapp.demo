package canerakin.vetapp.demo.business.abstracts;

import canerakin.vetapp.demo.business.models.requests.CreateAnimalRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateAnimalRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdAnimalResponse;

import java.util.List;

public interface AnimalService {


    List<GetAllAnimalResponse> getAll();

    void add(CreateAnimalRequest createAnimalRequest);

    void delete(int id);

    void update(UpdateAnimalRequest updateAnimalRequest);
    GetByIdAnimalResponse getById(int id);


}
