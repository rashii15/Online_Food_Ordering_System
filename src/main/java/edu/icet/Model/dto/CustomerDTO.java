package edu.icet.Model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CustomerDTO {
    private Long Id;
    private String name;
    private String contact;
    private String address;
}
