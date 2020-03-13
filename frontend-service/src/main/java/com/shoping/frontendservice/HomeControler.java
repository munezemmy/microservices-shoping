package com.shoping.frontendservice;

import com.shoping.frontendservice.model.Product;
import com.shoping.frontendservice.proxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeControler {

    @Autowired
    private ProductServiceProxy productServiceProxy;


    @GetMapping("/")
    public String indexPage( Model model, Product product  ){

        model.addAttribute("product", product);
        return "index";
    }

    @PostMapping("/product/save")
    public String saveProduct(@ModelAttribute("product")Product product, Model model){
        productServiceProxy.saveProduct(product);
        model.addAttribute("products", productServiceProxy.getAllProducts() );

        return "index" ;
    }


}
