package com.shoping.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private Double price;
    private Integer port;

}
