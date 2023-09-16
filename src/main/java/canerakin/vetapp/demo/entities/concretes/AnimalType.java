package canerakin.vetapp.demo.entities.concretes;


import canerakin.vetapp.demo.webApi.controllers.AnimalController;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "animal_types")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class AnimalType {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;




}
//BİR TÜRDE BİRDEN FAZLA HAYVAN OLABİLİR
//BİR HAYVANIN TEK BİR TÜRÜ OLABİLİR