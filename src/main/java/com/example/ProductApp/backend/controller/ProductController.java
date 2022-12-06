package com.example.ProductApp.backend.controller;

import com.example.ProductApp.backend.dao.ProductDao;
import com.example.ProductApp.backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct",consumes = "application/json",produces = "application/json")
    public  String addproduct(@RequestBody Products p){
        System.out.println(p.getProductcode());
        System.out.println(p.getProductname());
        System.out.println(p.getMfgdate());
        System.out.println(p.getExpdate());
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        System.out.println(p.getSellername());
        System.out.println(p.getDistributorname());
        dao.save(p);
        return "product details added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Products> viewall(){
        return(List<Products>)dao.findAll() ;
    }

}
