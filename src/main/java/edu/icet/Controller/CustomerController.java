package edu.icet.Controller;

import edu.icet.Model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @GetMapping("/all")
    public List<CustomerDTO> getAllDetails(){
        return customerService.getAllDetails();
    }

    @PostMapping("/add")
    public void add(@RequestBody CustomerDTO customer){
        customerService.add(customer);
    }
}
