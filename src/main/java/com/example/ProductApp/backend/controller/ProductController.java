package com.example.ProductApp.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @PostMapping("/")
    public String Home(){
        return "welcomr to home page";
    }

    @PostMapping("/add")
    public  String addproduct(){
        return "Add product details";
    }
}
