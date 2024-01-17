/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruitshopping;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author ninza
 */
class FruitController {
    private FruitModel model;
    private FruitView view;

    public FruitController(FruitModel model, FruitView view) {
        this.model = model;
        this.view = view;
    }

    public void createFruit() {
        Scanner sc = new Scanner(System.in);
        char continueCreating;

        do {
            System.out.print("Enter Fruit Id: ");
            int fruitId = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Fruit Name: ");
            String fruitName = sc.nextLine();
            System.out.print("Enter Origin: ");
            String origin = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            Fruit fruit = new Fruit(fruitId, fruitName, origin, price);
            model.addFruit(fruit);

            System.out.print("Do you want to continue (Y/N)? ");
            continueCreating = sc.next().charAt(0);
        } while (continueCreating == 'Y' || continueCreating == 'y');
    }

    public void viewOrders() {
        Hashtable<String, ArrayList<Fruit>> orders = model.getOrders();
        for (String customerName : orders.keySet()) {
            System.out.println("Customer: " + customerName);
            view.displayOrderSummary(orders.get(customerName));
            System.out.println();
        }
    }

    public void shopping() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fruit> orderList = new ArrayList<>();

        view.displayFruitList(model.getFruitList());
        System.out.println("To order, select Item.");

        char continueOrdering;
        do {
            System.out.print("Enter the Item number: ");
            int selectedItem = scanner.nextInt();
            Fruit selectedFruit = model.getFruitList().get(selectedItem - 1);

            System.out.println("You selected: " + selectedFruit.getFruitName());
            System.out.print("Please input quantity: ");
            int quantity = scanner.nextInt();

            selectedFruit.setQuantity(quantity);
            orderList.add(selectedFruit);

            System.out.print("Do you want to order now (Y/N)? ");
            continueOrdering = scanner.next().charAt(0);

        } while (continueOrdering == 'Y' || continueOrdering == 'y');

        scanner.nextLine(); // Consume newline
        System.out.print("Input your name: ");
        String customerName = scanner.nextLine();

        model.addOrder(customerName, orderList);
    }
}
