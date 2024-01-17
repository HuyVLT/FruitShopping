/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruitshopping;

/**
 *
 * @author ninza
 */
class Fruit {
    private int fruitId;
    private String fruitName;
    private String origin;
    private double price;
    private int quantity;

    public Fruit(int fruitId, String fruitName, String origin, double price) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.origin = origin;
        this.price = price;
        this.quantity = 0;
    }

    public int getFruitId() {
        return fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getOrigin() {
        return origin;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

