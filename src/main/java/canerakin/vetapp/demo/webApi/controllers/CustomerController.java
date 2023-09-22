package canerakin.vetapp.demo.webApi.controllers;

import canerakin.vetapp.demo.business.abstracts.CustomerService;
import canerakin.vetapp.demo.business.models.requests.CreateCustomerRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateCustomerRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllCustomerResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdCustomerResponse;
import canerakin.vetapp.demo.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CONTROLLER > SERVICE > MANAGER > REPOSITORY

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/getAll")
    public List<GetAllCustomerResponse> getAll(){
        return this.customerService.getAll();
    };

    @PostMapping("/add")
    void add(@RequestBody CreateCustomerRequest createCustomerRequest){
        this.customerService.add(createCustomerRequest);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable int id){
        this.customerService.delete(id);
    }

    @PutMapping("/update")
    void update(@RequestBody UpdateCustomerRequest updateCustomerRequest){
        this.customerService.update(updateCustomerRequest);
    }

    @GetMapping("/getById")
    public GetByIdCustomerResponse getById(@RequestParam int id){
        return this.customerService.getById(id);
    }


}
