package canerakin.vetapp.demo.business.models.requests;


import canerakin.vetapp.demo.entities.concretes.AnimalType;
import jakarta.persistence.Column;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class UpdateAnimalRequest {


    @NotNull
    @NotBlank
    private int Id;

    @NotNull
    @NotBlank
    private int passportNo;


    private String Breed;


    private String Name;


    private int Age;

    @NotNull
    @NotBlank
    private int SerialNo;

    private String Description;






}
