package com.ddd.Shipment.rest.contracts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UserResponse {
    private String name;
    private String email;
    private String phoneNumber;
}
