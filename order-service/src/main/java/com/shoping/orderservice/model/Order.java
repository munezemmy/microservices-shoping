package com.shoping.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Order {
    private long id;
    private long productId;
    private  String productName;
    private BigDecimal price;
    private int noOfItems;
    private double totalPrice;
    private int port;

}
