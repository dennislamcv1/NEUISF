/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CustomersReport {
    ArrayList<CustomerSummary> customerlist;

    // Please do NOT remove or modify the name CustomersReport()

    public CustomersReport() {
        // Part 2 TO DO: YOUR CODE HERE
    }

    // Please do NOT remove or modify the name of addCustomerSummary
    public void addCustomerSummary(CustomerSummary cs) {
        // Part 2 TO DO: YOUR CODE HERE
    }

    // Part 2: Please do NOT remove or modify the name of the method
    // printShortCustomerReport()
    public void printShortCustomerReport() {
        System.out.println("Short Customer Performance Report");
        System.out.println("Below are customer name, total sales and number of orders.");
        // Part 2 TO DO: YOUR CODE HERE
        // Print a short customer Report with the following and using System.out.println
        // - Customer’s name
        // - Total sales of that specific customer
        // - Number of orders of that
        // Call printShortCustomerSummary() to print results
    }

    // Part 3: Please do NOT remove or modify the name of the method
    // printFullCustomerReport()
    public void printFullCustomerReport() {
        System.out.println("Full Customer Performance Report");
        System.out.println(
                "Below are customer name, total sales, number of orders, total number of items, average amount per order and average amount per item.");
        // Part 3 TO DO: YOUR CODE HERE
        // Print a longer Customer Report adding the following and using
        // System.out.println:
        // - Customer’s name
        // - Total sales of that specific customer
        // - Number of orders
        // - Total number of Items bought by a specific customer
        // - Average amount per order
        // - Average amount per item
        // Call printFullCustomerSummary() to print results
    }
}
