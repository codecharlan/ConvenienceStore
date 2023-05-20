package com.codecharlan.conveniencestore.models;

public class Cashier extends Staff {
        public Cashier(String employeeName, String employeeID, String hireDate, Double salary) {
            super(employeeName, employeeID, hireDate, salary);
        }


        public String scanProduct(Product product){
//            System.out.println("The price is of " + products.getProductName()
//                    + " is $"+products.getProductPrice());
            return "The price is of " + product.getProductName()
                    + " is $"+ product.getProductPrice();
        }
        public String processPayment(){
            System.out.println("Choose Payment Method");
            return "Choose Payment Method";
        }
        public String printReceipt(Product product){
//            System.out.println("Payment successful!!!, Your receipt of " +
//                    "$"+products.getProductPrice()+ " for "+
//                    products.getProductName() + " is being printed");
            return "Payment successful!!!, Your receipt of " +
                    "$"+ product.getProductPrice()+ " for "+
                    product.getProductName() + " is being printed";
        }

    }

