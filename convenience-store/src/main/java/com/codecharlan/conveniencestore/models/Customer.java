package com.codecharlan.conveniencestore.models;

public class Customer {
        private String customerName;
        private Double accountBalance;

        public Customer(String customerName, Double accountBalance) {
            this.customerName = customerName;
            this.accountBalance = accountBalance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public Double getAccountBalance() {
            return accountBalance;
        }

        public void setAccountBalance(Double accountBalance) {
            this.accountBalance = accountBalance;
        }

        public String selectProduct(Product product) {
//            System.out.println(products.getProductName()+ " has been added to cart");
            return product.getProductName()+ " has been added to cart";
        }

        public String makePayment(Product product, Double amountPaid) {
            if (product.getProductPrice() > amountPaid ||
                    accountBalance < product.getProductPrice() ) {
//                System.out.println("Payment Unsuccessful");
                return "Payment Unsuccessful";
            } else {
//                System.out.println("Payment Successful");
                return "Payment Successful";
            }
        }
    }
