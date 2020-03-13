package com.shoping.orderservice.controller;


import com.shoping.orderservice.feignProxy.ProductServiceProxy;
import com.shoping.orderservice.model.Order;
import com.shoping.orderservice.model.Product;
import com.shoping.orderservice.sevice.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class OrderControler {

    @Autowired
    private ProductServiceProxy proxy;
    @Autowired
    private OderService oderService;


    @GetMapping("/orders/{id}/{items}")
    public Order orderCalculation(@PathVariable("id") long id, @PathVariable("items")int noOfItems){

             Product response=proxy.getOneProduct(id);

             return new Order(1, response.getId(), response.getName(), BigDecimal.valueOf(response.getPrice()), noOfItems, oderService.amountToPay(response.getPrice(), noOfItems), response.getPort());


    }
}
