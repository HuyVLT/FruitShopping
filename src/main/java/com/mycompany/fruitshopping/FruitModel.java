/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruitshopping;

/**
 *
 * @author ninza
 */

import java.util.ArrayList;
import java.util.Hashtable;

class FruitModel {
    private ArrayList<Fruit> fruitList;
    private Hashtable<String, ArrayList<Fruit>> orders;

    public FruitModel() {
        this.fruitList = new ArrayList<>();
        this.orders = new Hashtable<>();
    }

    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public void addOrder(String customerName, ArrayList<Fruit> orderList) {
        orders.put(customerName, orderList);
    }

    public Hashtable<String, ArrayList<Fruit>> getOrders() {
        return orders;
    }
}

