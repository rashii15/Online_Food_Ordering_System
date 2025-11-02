package edu.icet.service;

import edu.icet.Model.dto.CustomerDTO;
import edu.icet.Model.entitiy.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void add(CustomerDTO customer) {
        CustomerEntity customerEntity=new CustomerEntity(
                customer.getId(),
                customer.getName(),
                customer.getContact(),
                customer.getAddress()
                );
        customerRepository.save(customerEntity);
    }

    public List<CustomerDTO> getAllDetails() {
        List<CustomerEntity> all = customerRepository.findAll();
        List<CustomerDTO> customers = new ArrayList<>();

        for (CustomerEntity customerEntity:all){
                customers.add(new CustomerDTO(
                   customerEntity.getId(),
                   customerEntity.getName(),
                   customerEntity.getContact(),
                   customerEntity.getAddress()
            ));
        }
        return customers;
    }
}
