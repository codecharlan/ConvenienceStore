package com.codecharlan.conveniencestore;

import com.codecharlan.conveniencestore.models.Cashier;
import com.codecharlan.conveniencestore.models.Manager;
import com.codecharlan.conveniencestore.models.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void hireCashier() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Manager manager = new Manager("Fred",
                staff.getEmployeeID() + 1, "09/11/2024", 568676.66);
        Cashier cashier = new Cashier("Tom", staff.getEmployeeID() + 2, "03/06/2020", 200890.83);
        assertEquals("Angela has been hired on 09/11/2024", manager.hireCashier("Angela"), "Hire Unsuccessful");
    }

    @Test
    void fireCashier() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Manager manager = new Manager("Fred",
                staff.getEmployeeID() + 1, "09/11/2024", 568676.66);
        Cashier cashier = new Cashier("Tom", staff.getEmployeeID() + 2, "03/06/2020", 200890.83);
        assertEquals("Tom with IDA3452672 has been fired", manager.fireCashier(cashier), "Fire Unsuccessful");
    }

    @Test
    void manageInventory() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Manager manager = new Manager("Fred", staff.getEmployeeID() + 1, "09/11/2024", 568676.66);
        assertEquals("Inventory has been updated", manager.manageInventory(), "Try Again");
    }

    @Test
    void signIn() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Manager manager = new Manager("Fred", staff.getEmployeeID() + 1, "09/11/2024", 568676.66);
        assertEquals("Welcome Fred!\n" +
                "Signed in Successfully", manager.signIn("1234"), "Sign In Unsuccessful, Try Again");
    }


    @Test
    void signOut() {
        Staff staff = new Staff("Ada",
                "A345267", "12/03/2004",
                345627.63);
        Manager manager = new Manager("Fred", staff.getEmployeeID() + 1, "09/11/2024", 568676.66);
        assertEquals("GoodBye Fred!\n" +
                "Signed out Successfully", manager.signOut(), "Sign Out Unsuccessful");

    }
}