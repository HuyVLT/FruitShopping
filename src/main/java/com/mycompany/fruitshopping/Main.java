/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fruitshopping;

/**
 *
 * @author ninza
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitModel model = new FruitModel();
        FruitView view = new FruitView();
        FruitController controller = new FruitController(model, view);

        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            view.displayMenu();
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    controller.createFruit();
                    break;
                case 2:
                    controller.viewOrders();
                    break;
                case 3:
                    controller.shopping();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        } while (choice != 4);

        
    }
}


