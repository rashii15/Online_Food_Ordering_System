package edu.icet.Model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FoodDTO {
    private String id;
    private String name;
    private String availableQuantity;
    private Double unitPrice;
}
