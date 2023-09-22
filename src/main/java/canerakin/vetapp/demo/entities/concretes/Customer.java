package canerakin.vetapp.demo.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_no")
    private String  identificationNo;

    @Column(name = "gsm")
    private String gsm;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Animal> animals;

    

}
