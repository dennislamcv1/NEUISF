/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Business.Business;
import model.Business.ConfigureABusiness;
// import model.ProductManagement.ProductCatalog;
// import model.ProductManagement.ProductsReport;
// import model.Supplier.Supplier;
// import model.Supplier.SupplierDirectory;
// import model.CustomerManagement.CustomersReport;
// import model.OrderManagement.MasterOrderList;
// import model.OrderManagement.MasterOrderReport;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Part 1: TODO Code application logic here. 
    // Implement the following:

    // 1. Populate the model 
    // Modify the provided line below to create 1 Business based on instructions parameters listed.
    Business business = ConfigureABusiness.initialize();

    // - Suppliers - 30 Suppliers
    // - Pick any 5 Suppliers and add 20 Products to each
    // - Customers - 30 customers
    // - For each Customer add 5 to 15 Orders with 1 to 5 Items to each Order
    
   // 2. Show prompted analytics (links to your work in Part 2 and 3)

  }
}
