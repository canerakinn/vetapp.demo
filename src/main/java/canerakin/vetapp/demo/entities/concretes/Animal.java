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
    @Column(name = "animal_id")
    private int animalId;

    @Column(name = "passport_id", unique = true)
    private int passportId;

    @Column(name = "animal_breed")
    private String animalBreed;

    @Column(name = "animal_name")
    private String animalName;

    @Column(name = "animal_age")
    private int animalAge;

    @Column(name = "animal_serial_no", unique = true)
    private int animalSerialNo;

    @Column(name= "animal_description")
    private String animalDescription;

    @ManyToOne
    @JoinColumn(name = "animal_type_id")
    private AnimalType animalType;


}
