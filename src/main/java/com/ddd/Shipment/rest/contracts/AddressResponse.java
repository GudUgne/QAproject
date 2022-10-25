package com.ddd.Shipment.rest.contracts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class AddressResponse {
    private Integer id;
    private String city;
    private String address;
    private String postalCode;
}
