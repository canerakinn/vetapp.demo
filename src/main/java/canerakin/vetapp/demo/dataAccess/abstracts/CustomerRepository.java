package canerakin.vetapp.demo.dataAccess.abstracts;

import canerakin.vetapp.demo.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
