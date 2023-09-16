package canerakin.vetapp.demo.business.models.responses;

import canerakin.vetapp.demo.entities.concretes.AnimalType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllAnimalResponse {


    private int Id;


    private int PassportNo;


    private String Breed;


    private String Name;


    private int Age;


    private int SerialNo;


    private String Description;

    private AnimalType animalType;


}
