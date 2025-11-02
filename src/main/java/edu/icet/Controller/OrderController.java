package edu.icet.Controller;

import edu.icet.Model.dto.CustomerDTO;
import edu.icet.Model.dto.FoodDTO;
import edu.icet.Model.dto.OrderDTO;
import edu.icet.service.CustomerService;
import edu.icet.service.FoodService;
import edu.icet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;

    @Autowired
    FoodService foodService;


    @GetMapping("/orders/all")
    public List<OrderDTO> getAllDetails(){
        return orderService.getAllDetails();
    }

    @PostMapping("/orders/add")
    public void add(@RequestBody OrderDTO order/*, CustomerDTO customer, FoodDTO foodDTO*/){
        orderService.add(order/*,customer,foodDTO*/);
    }

}
