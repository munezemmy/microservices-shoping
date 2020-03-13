package com.shoping.frontendservice.proxy;


import com.shoping.frontendservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "product-service", url ="localhost:8000")
public interface ProductServiceProxy {

    @PostMapping("products")
    Product saveProduct(@RequestBody Product product);

    @GetMapping("/products")
    public List<Product> getAllProducts();
}
