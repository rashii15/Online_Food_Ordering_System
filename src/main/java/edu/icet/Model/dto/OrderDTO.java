package edu.icet.Model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDTO {
    private String orderid;
    private String orderdate;
    private String quantity;
    private String status;
    private Double totalprice;
}
