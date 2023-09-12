package canerakin.vetapp.demo.business.concretes;

import canerakin.vetapp.demo.business.abstracts.AnimalService;
import canerakin.vetapp.demo.business.core.utilities.mappers.ModelMapperService;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalResponse;
import canerakin.vetapp.demo.dataAccess.abstracts.AnimalRepository;
import canerakin.vetapp.demo.entities.concretes.Animal;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Configuration
@AllArgsConstructor

public class AnimalManager implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    public ModelMapperService modelMapperService;


    public AnimalManager(ModelMapperService modelMapperService) {
        super();
        this.modelMapperService = modelMapperService;
    }

    @Autowired
    public AnimalManager(AnimalRepository animalRepository) {
        super();
        this.animalRepository = animalRepository;

    }


    @Override
    public List<GetAllAnimalResponse> getAll() {

        List<Animal> animals = animalRepository.findAll();

        List<GetAllAnimalResponse> getAllAnimalResponses = animals.stream().map(animal -> this.modelMapperService.forResponse().map(animal, GetAllAnimalResponse.class)).collect(Collectors.toList());
        return getAllAnimalResponses;


    }


}

