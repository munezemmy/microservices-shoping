package com.shoping.orderservice.sevice;

import org.springframework.stereotype.Service;

@Service
public class OderService {


    public double amountToPay(double price, int noOfItems){
        return price*noOfItems;
    }
}
