package com.example.fishhelp;

public class LureClass {
    String brand, model, color, price;

    public LureClass() {}

    public LureClass(String color, String price) {
        this.color = color;
        this.price = price;
    }

    public LureClass(String brand, String model, String color, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
