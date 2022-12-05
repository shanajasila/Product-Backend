package com.example.ProductApp.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @PostMapping("/")
    public String Home(){
        return "welcomr to home page";
    }

    @PostMapping("/addproduct")
    public  String addproduct(){
        return "Add product details";
    }

    @PostMapping("/searchproduct")
    public String searchproduct(){
        return "Search productd here";
    }


    @PostMapping("/editproduct")
    public  String editproduct(){
        return "welcome to edit product";
    }
}
