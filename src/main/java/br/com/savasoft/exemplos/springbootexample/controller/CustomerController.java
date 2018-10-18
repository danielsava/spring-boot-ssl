package br.com.savasoft.exemplos.springbootexample.controller;


import br.com.savasoft.exemplos.springbootexample.pojo.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {



    public Customer getCustomer(@PathVariable Long id) {
        return new Customer(id, " " + id.hashCode());
    }

}
