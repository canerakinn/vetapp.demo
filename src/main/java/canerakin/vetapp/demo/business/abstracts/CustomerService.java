package canerakin.vetapp.demo.business.abstracts;

import canerakin.vetapp.demo.business.models.requests.CreateCustomerRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateCustomerRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllCustomerResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdCustomerResponse;
import canerakin.vetapp.demo.entities.concretes.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

     List<GetAllCustomerResponse> getAll();

     void  add(CreateCustomerRequest createCustomerRequest);

     void delete(int id);

     void update (UpdateCustomerRequest updateCustomerRequest);

     GetByIdCustomerResponse getById(int id);

}
