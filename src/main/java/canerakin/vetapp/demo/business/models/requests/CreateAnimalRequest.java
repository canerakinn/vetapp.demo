package canerakin.vetapp.demo.business.models.requests;

import canerakin.vetapp.demo.entities.concretes.AnimalType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateAnimalRequest {


    private int PassportNo;


    private String Breed;


    private String Name;


    private int Age;


    private int SerialNo;


    private String Description;




}
