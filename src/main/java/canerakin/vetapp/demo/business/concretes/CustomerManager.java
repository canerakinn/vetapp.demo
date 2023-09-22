package canerakin.vetapp.demo.business.concretes;

import canerakin.vetapp.demo.business.abstracts.CustomerService;
import canerakin.vetapp.demo.business.core.utilities.mappers.ModelMapperService;
import canerakin.vetapp.demo.business.models.requests.CreateAnimalRequest;
import canerakin.vetapp.demo.business.models.requests.CreateCustomerRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateCustomerRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalTypeResponse;
import canerakin.vetapp.demo.business.models.responses.GetAllCustomerResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdCustomerResponse;
import canerakin.vetapp.demo.dataAccess.abstracts.CustomerRepository;
import canerakin.vetapp.demo.entities.concretes.Animal;
import canerakin.vetapp.demo.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@NoArgsConstructor
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapperService modelMapperService;




    @Autowired
    private CustomerManager(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    };

    @Override
    public List<GetAllCustomerResponse> getAll() {

        List<Customer> customers = this.customerRepository.findAll();

        List< GetAllCustomerResponse> getAllCustomerResponses = customers.stream()
                .map(customer -> this.modelMapperService.forResponse().map(customer,GetAllCustomerResponse.class)).collect(Collectors.toList());
        return getAllCustomerResponses;



    }

    @Override
    public void add(CreateCustomerRequest createCustomerRequest) {

        Customer customer= this.modelMapperService.forRequest().map(createCustomerRequest, Customer.class);
        this.customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCustomerRequest updateCustomerRequest) {
        Customer customer = this.modelMapperService.forRequest().map(updateCustomerRequest, Customer.class);
        this.customerRepository.save(customer);
    }

    @Override
    public GetByIdCustomerResponse getById(int id) {
        Customer customer = this.customerRepository.findById(id).orElseThrow();

        GetByIdCustomerResponse getByIdCustomerResponse = modelMapperService.forResponse().map(customer, GetByIdCustomerResponse.class);
        return getByIdCustomerResponse;
    }


}
