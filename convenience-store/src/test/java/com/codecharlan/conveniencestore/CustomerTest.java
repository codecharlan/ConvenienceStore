package com.codecharlan.conveniencestore;

import com.codecharlan.conveniencestore.models.Customer;
import com.codecharlan.conveniencestore.models.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void selectProduct(Product product) {
        product = new Product("Corn Flakes", 450.00, 30);
        Customer customer = new Customer("Samuel", 2341.567);
        assertEquals(product.getProductName() + " has been added to cart", customer.selectProduct(product), "Choose payment type");
    }

    @Test
    void makePayment() {
        Customer customer = new Customer("Samuel", 2341.567);
        Product product = new Product("Corn Flakes", 450.00, 30);
        assertEquals("Payment Unsuccessful", customer.makePayment(product,100.00), "Payment Successful");

    }
}