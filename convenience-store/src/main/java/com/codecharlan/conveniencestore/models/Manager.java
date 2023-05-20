package com.codecharlan.conveniencestore.models;

import services.AuthoriseService;

public class Manager extends Staff {

        public Manager(String employeeName, String employeeID, String hireDate, Double salary) {
            super(employeeName, employeeID, hireDate, salary);
        }

        public String hireCashier(String employeeName){
//            System.out.println(employeeName + " has been hired" + " on " + getHireDate());

            return employeeName + " has been hired" + " on " + getHireDate();
        }
        public String fireCashier(Staff staff){
//            System.out.println(staff.getEmployeeName() + " with ID" + staff.getEmployeeID() + " has been fired");
            return staff.getEmployeeName() + " with ID" + staff.getEmployeeID() + " has been fired";
        }
        public String manageInventory(){
//            System.out.println("Inventory has been updated");
            return "Inventory has been updated";
        }

    }

