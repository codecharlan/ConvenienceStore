package com.codecharlan.conveniencestore;

import com.codecharlan.conveniencestore.models.Product;
import com.codecharlan.conveniencestore.models.Staff;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void restockProduct() {
        Staff staff = new Staff("Ada", "A345267", "12/03/2004", 345627.63);
        Product product = new Product("Corn Flakes", 450.00, 30);
        int restockSize = 34;
        int productQuantity = 30;
        assertEquals(restockSize +" pieces of " + product.getProductName()
                + " has been added to " + productQuantity +
                " making a total of " + (restockSize+productQuantity), product.restockProduct(34), "UnSuccessful");

    }

    @Test
    void updatePrice() {
        Staff staff = new Staff("Ada", "A345267", "12/03/2004", 345627.63);
        Product product = new Product("Corn Flakes", 450.00, 30);

        assertEquals("The price of "+ product.getProductName()
                + " has been updated successfully", product.updatePrice(12), "Price Update UnSuccessful");
    }

    @Test
    void discountPrice() {
        Product product = new Product("Corn Flakes", 450.00, 30);
        int priceDiscountInPercent = 2;
        assertEquals(priceDiscountInPercent+"% discount"
                + " has been applied on " + product.getProductName(), product.discountPrice(2), "No Discount Applied");

    }
}