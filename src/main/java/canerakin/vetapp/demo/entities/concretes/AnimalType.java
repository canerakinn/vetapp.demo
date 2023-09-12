package canerakin.vetapp.demo.entities.concretes;


import canerakin.vetapp.demo.webApi.controllers.AnimalController;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "animal_types")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Data
public class AnimalType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private int Id;
    @Column(name = "type_name")
    private String typeName;

    @OneToMany(mappedBy = "animalType")
    private List<Animal> animals;
}
//BİR TÜRDE BİRDEN FAZLA HAYVAN OLABİLİR
//BİR HAYVANIN TEK BİR TÜRÜ OLABİLİR