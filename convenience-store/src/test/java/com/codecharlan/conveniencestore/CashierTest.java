package com.codecharlan.conveniencestore;

import com.codecharlan.conveniencestore.models.Cashier;
import com.codecharlan.conveniencestore.models.Product;
import com.codecharlan.conveniencestore.models.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void signIn() {
//        Staff staff = new Staff("Ada",
//                "A345267", "12/03/2004",
//                345627.63);
        Cashier cashier = new Cashier("Tom",
                "A3452671",
                "03/06/2020", 200890.83);

        assertEquals("Welcome Tom!\n" +
                "Signed in Successfully", cashier.signIn("34562"), "Password does not match");

    }

    @Test
    void signOut() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Cashier cashier = new Cashier("Tom",
                staff.getEmployeeID() + 2,
                "03/06/2020", 200890.83);
        assertEquals("GoodBye Tom!\n" +
                "Signed out Successfully", cashier.signOut(), "Sign Out Unsuccessful");
    }

//    @Test
//    void scanProduct() {
//        Staff staff = new Staff("Ada",
//                "A345267", "12/03/2004",
//                345627.63);
//        Cashier cashier = new Cashier("Tom",
//                staff.getEmployeeID() + 2,
//                "03/06/2020", 200890.83);
//        Products products = new Products("Corn Flakes", 450.00, 30);
//        assertEquals("The price is of " + products.getProductName() + " is $" + products.getProductPrice()), cashier.scanProduct(products), "Sign Out Unsuccessful");
//    }


    @Test
    void processPayment() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Cashier cashier = new Cashier("Tom",
                staff.getEmployeeID() + 2,
                "03/06/2020", 200890.83);
        assertEquals("Choose Payment Method", cashier.processPayment(), "Choose payment type");
    }

    @Test
    void printReceipt() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Cashier cashier = new Cashier("Tom",
                staff.getEmployeeID() + 2,
                "03/06/2020", 200890.83);
        Product product = new Product("Corn Flakes", 450.00, 30);
        assertEquals("Payment successful!!!, Your receipt of " +
                "$"+ product.getProductPrice()+ " for "+
                product.getProductName() + " is being printed", cashier.printReceipt(product), "Choose payment type");
    }
}