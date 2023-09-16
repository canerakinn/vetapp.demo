package canerakin.vetapp.demo.business.rules;

import canerakin.vetapp.demo.business.core.utilities.exceptions.BusinessException;
import canerakin.vetapp.demo.dataAccess.abstracts.AnimalRepository;
import canerakin.vetapp.demo.dataAccess.abstracts.AnimalTypeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@NoArgsConstructor
@Service
public class AnimalTypeBusinessRules {

    @Autowired
    private AnimalTypeRepository animalTypeRepository;



    public void checkIfAnimalTypeExists(String name){
        if(this.animalTypeRepository.existsByName(name)){
            throw new BusinessException("Animal Type Already Exists");
        }

    }
}
