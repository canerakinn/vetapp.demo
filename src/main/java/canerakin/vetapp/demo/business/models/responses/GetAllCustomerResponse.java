package canerakin.vetapp.demo.business.models.responses;

import canerakin.vetapp.demo.entities.concretes.Animal;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllCustomerResponse {


    private int id;


    private String firstName;


    private String lastName;


    private String  identificationNo;


    private String gsm;


    private String email;


    private List<Animal> animals;
}
