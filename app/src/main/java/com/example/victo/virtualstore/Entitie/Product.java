package com.example.victo.virtualstore.Entitie;

/**
 * Created by victo on 13/11/2017.
 */

import com.example.victo.virtualstore.HELPER.CurrencyHelper;

import java.io.Serializable;

public class Product implements Serializable {


    public Product() { }

    private String image;
    private String title;
    private Double price;
    private String zipCode;
    private String seller;
    private String date;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        return CurrencyHelper.parseDoubleToCurrency(this.price);
    }

    public void setPrice(String price) {
        this.price = Double.parseDouble(price)/100;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
