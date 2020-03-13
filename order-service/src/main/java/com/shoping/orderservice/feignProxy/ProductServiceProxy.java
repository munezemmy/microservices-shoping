package com.shoping.orderservice.feignProxy;


import com.shoping.orderservice.model.Product;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "localhost:8100")
@RibbonClient(name = "product-service")
public interface ProductServiceProxy {

    @GetMapping("/products/{id}")
    Product getOneProduct(@PathVariable("id") long id);
}
