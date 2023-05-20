package com.codecharlan.conveniencestore;

import com.codecharlan.conveniencestore.models.*;
import services.implementation.AuthoriseServiceCashierImpl;
import services.implementation.AuthoriseServiceManagerImpl;
import services.implementation.ProductCatalogServiceManagerImpl;

public class ConvenienceStoreApplication {

		public static void main(String[] args) {
			Manager manager = new Manager("Fred", "A3452671", "09/11/2024", 568676.66);
			Cashier cashier = new Cashier("Tom", "A3452672", "03/06/2020", 200890.83);
			Product product = new Product("Corn Flakes", 450.00, 30);
			Customer customer = new Customer("Samuel", 2341.567);
			AuthoriseServiceManagerImpl managerimpl = new AuthoriseServiceManagerImpl();
			AuthoriseServiceCashierImpl cashierimpl = new AuthoriseServiceCashierImpl();
			ProductCatalogServiceManagerImpl productimpl = new ProductCatalogServiceManagerImpl();


			managerimpl.signIn("1234");
			managerimpl.signOut();
			manager.hireCashier("Angela");
			manager.fireCashier(cashier);
			manager.manageInventory();
			System.out.println(manager.getEmployeeID());

			System.out.println("...............");

			System.out.println(cashierimpl.signIn("B2345671"));
			cashierimpl.signOut();
			cashier.printReceipt(product);
			cashier.scanProduct(product);
			cashier.processPayment();

			System.out.println("...............");

			customer.setAccountBalance(10000.004);
			customer.selectProduct(product);
			customer.makePayment(product,400.89);

			System.out.println("...............");

			product.setProductPrice(50.00);
			productimpl.discountPrice(2);
			productimpl.restockProduct(34);
			product.setProductQuantity(120);
			productimpl.updatePrice(12);

			//Test cases Available in test folder
		}

}
