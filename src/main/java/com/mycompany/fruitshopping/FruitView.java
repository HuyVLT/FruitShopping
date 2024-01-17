/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruitshopping;

import java.util.ArrayList;
/**
 *
 * @author ninza
 */


class FruitView {
    public void displayMenu() {
        System.out.println("FRUIT SHOP SYSTEM");
        System.out.println("1. Create Fruit");
        System.out.println("2. View Orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }

    public void displayFruitList(ArrayList<Fruit> fruitList) {
        System.out.println("List of Fruits:");
        System.out.printf("| %-10s | %-15s | %-15s | %-10s |\n", "++ Item ++", "++ Fruit Name ++", "++ Origin ++", "++ Price ++");
        for (Fruit fruit : fruitList) {
            System.out.printf("| %-10d | %-15s | %-15s | $%-10.2f |\n", fruit.getFruitId(), fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice());
        }
    }

    public void displayOrderSummary(ArrayList<Fruit> orderList) {
        System.out.println("Product | Quantity | Price | Amount");
        for (Fruit fruit : orderList) {
            System.out.printf("%-8s%-12d$%-7.2f$%-7.2f\n", fruit.getFruitName(), fruit.getQuantity(), fruit.getPrice(), fruit.getQuantity() * fruit.getPrice());
        }
    }
}