package com.fanap.question_5.controller;

import com.fanap.question_5.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseBody
    public String products(@RequestParam int from, int count) {
        Map<String, String> products;
        products = productService.getAllProducts(from, count);
        System.out.println(products.values().toString());
        return products.values().toString();
    }
}
