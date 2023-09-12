package canerakin.vetapp.demo.dataAccess.abstracts;

import canerakin.vetapp.demo.entities.concretes.Animal;
import canerakin.vetapp.demo.entities.concretes.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer>  {



}
