/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Business;

import java.util.Random;

import model.Business.Business;
// import model.CustomerManagement.CustomerDirectory;
// import model.CustomerManagement.CustomerProfile;
// import model.MarketingManagement.MarketingPersonDirectory;
// import model.MarketingManagement.MarketingPersonProfile;
// import model.OrderManagement.MasterOrderList;
// import model.OrderManagement.Order;
// import model.OrderManagement.OrderItem;
// import model.Personnel.EmployeeDirectory;
// import model.Personnel.EmployeeProfile;
// import model.Personnel.Person;
// import model.Personnel.PersonDirectory;
// import model.ProductManagement.Product;
// import model.ProductManagement.ProductCatalog;
// import model.SalesManagement.SalesPersonDirectory;
// import model.SalesManagement.SalesPersonProfile;
// import model.Supplier.Supplier;
// import model.Supplier.SupplierDirectory;
// import model.UserAccountManagement.UserAccount;
// import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");

    // Add Suppliers +

    // Add Products +

    // Add Customers

    // Add Order

    return business;
  }

  static void loadOrders(Business b, int orderCount, int itemCount) {
    // PART 1 TASK:
    // YOUR CODE HERE

    // Reach out to masterOrderList
    // Pick a random customer (reach to customer directory)

    // Create an order for that customer

    // -- add order items

    // -- pick a supplier first (randomly)

    // -- pick a product (randomly)

    // -- actual price, quantity
  }
  // Make sure order items are connected to the order
}