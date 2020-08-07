package com.example.demo.api;

import com.example.demo.model.Customer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public ResponseEntity<Customer> getCustomer(){
        Customer customer =  new Customer(UUID.randomUUID(),"Kyaw Kyaw");
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<String> updateCustomer(@RequestBody  Customer customer){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/customer/" + customer.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }

}
