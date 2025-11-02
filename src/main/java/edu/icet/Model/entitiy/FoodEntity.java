package edu.icet.Model.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FoodEntity {
    @Id
    private String  id;
    private String name;
    private String availableQuantity;
    private Double unitPrice;
}
