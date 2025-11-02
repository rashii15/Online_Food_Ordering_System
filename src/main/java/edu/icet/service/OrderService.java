package edu.icet.service;

import edu.icet.Model.dto.CustomerDTO;
import edu.icet.Model.dto.FoodDTO;
import edu.icet.Model.dto.OrderDTO;
import edu.icet.Model.entitiy.CustomerEntity;
import edu.icet.Model.entitiy.FoodEntity;
import edu.icet.Model.entitiy.OrderEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.repository.FoodRepository;
import edu.icet.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    FoodRepository foodRepository;
    @Autowired
    OrderRepository orderRepository;


    public void add(OrderDTO order/*, CustomerDTO customerDTO, FoodDTO foodDTO*/) {
//        CustomerEntity customerEntity=customerRepository.findById(customerDTO.getId());
//        FoodEntity foodEntity=foodRepository.findById(foodDTO.getId());

        OrderEntity orderEntity =new OrderEntity(
                order.getOrderid(),
                order.getOrderdate(),
                order.getQuantity(),
                order.getStatus(),
                order.getTotalprice()
//                customerEntity.getId(),
//                foodEntity.getId()

        );
        orderRepository.save(orderEntity);
    }

    public List<OrderDTO> getAllDetails() {
        List<OrderEntity> all = orderRepository.findAll();
        List<OrderDTO> orders = new ArrayList<>();

        for (OrderEntity orderEntity:all){
            orders.add(new OrderDTO(
                    orderEntity.getOrderid(),
                    orderEntity.getOrderdate(),
                    orderEntity.getQuantity(),
                    orderEntity.getStatus(),
                    orderEntity.getTotalprice()
            ));
        }
        return orders;
    }
}
