package com.example.ProductApp.backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Products {

    @Id
    @GeneratedValue
    private int id;
    private int productcode;
    private String productname;
    private String mfgdate;
    private String expdate;
    private String brand;
    private String price;
    private String sellername;
    private String distributorname;


    public Products() {
    }

    public Products(int id, int productcode, String productname, String mfgdate, String expdate, String brand, String price, String sellername, String distributorname) {
        this.id = id;
        this.productcode = productcode;
        this.productname = productname;
        this.mfgdate = mfgdate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.distributorname = distributorname;
    }

    public int getId() {
        return id;
    }

    public int getProductcode() {
        return productcode;
    }

    public String getProductname() {
        return productname;
    }

    public String getMfgdate() {
        return mfgdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    public String getSellername() {
        return sellername;
    }

    public String getDistributorname() {
        return distributorname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setMfgdate(String mfgdate) {
        this.mfgdate = mfgdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public void setDistributorname(String distributorname) {
        this.distributorname = distributorname;
    }
}
