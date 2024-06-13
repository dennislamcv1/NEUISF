/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import model.OrderManagement.Order;

/**
 *
 * @author kal bugrara
 */
public class CustomerSummary {

    CustomerProfile customer;

    // Part 2: TO DO
    // Set new properties for the below. Do NOT change property names.
    // - name;
    // - totalSales;
    // - numberOfOrders;

    // Part 3: TO DO
    // Set new properties for the below. Do NOT change property names.
    // - totalNumberOfItems;
    // - averageAmountPerOrder;
    // - averageAmountPerItem;
    // - subjectorder;
    // - ordertotal;
    
    public CustomerSummary(CustomerProfile cp) {
        // # Part 2 and 3: TO DO 
        // # Add methods to set Customer Values based on properties above and print statements provided below.
        // # Please do not rename, remove, or modify any provided methods within classes you import.
        // Ex: You should add implementations for getTotalNumberOfItems, averageAmountPerOrder, averageAmountPerItem among others
    }

    // For use in Part 2: Please do NOT Change this method. Instead make sure you've implemented the appropriate variables listed.
    public void printShortCustomerSummary() {
        String output = String.format("%-20s | %4d | %4d | ", name, totalSales, numberOfOrders);
        System.out.println(output);
    }

    // For use in Part 3: Please do NOT Change this method. Instead make sure you've implemented the appropriate variables listed.
    public void printFullCustomerSummary() {
        String output = String.format("%-20s | %4d | %4d | %4d | %6.2f | %6.2f", name, totalSales, numberOfOrders,
                totalNumberOfItems,
                averageAmountPerOrder, averageAmountPerItem);
        System.out.println(output);
    }
    
}
