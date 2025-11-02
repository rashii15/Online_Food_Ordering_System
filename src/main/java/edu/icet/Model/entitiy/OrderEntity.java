package edu.icet.Model.entitiy;

import edu.icet.Model.dto.FoodDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderEntity {
    @Id
    private String orderid;
    private String orderdate;
    private String quantity;
    private String status;
    private Double totalprice;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="Customer_id")
//    private CustomerEntity customerEntity;
//
//    @ManyToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "food_id")
//    private FoodEntity foodEntity;
}
