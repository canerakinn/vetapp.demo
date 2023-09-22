package canerakin.vetapp.demo.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "animals")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Data


public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "passport_no", unique = true)
    private int passportNo;

    @Column(name = "breed")
    private String breed;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "serial_no", unique = true)
    private int serialNo;

    @Column(name= "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "animal_type_id" )
    private AnimalType animalType;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
