package com.example.avalbekov_omurbek_3_hw4;

import java.io.Serializable;

public class Watch implements Serializable {
    String name, description, price;
    int image, zvezda;

    public Watch(String name, String description, int image, String price, int zvezda) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.zvezda = zvezda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getZvezda() {
        return zvezda;
    }

    public void setZvezda(int zvezda) {
        this.zvezda = zvezda;
    }
}
