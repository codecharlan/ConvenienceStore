package com.codecharlan.conveniencestore.models;

    public abstract class Staff {
        private String employeeName;
        private String employeeID;
        private String hireDate;
        private Double salary;


        public Staff(String employeeName, String employeeID, String hireDate, Double salary) {
            this.employeeName = employeeName;
            this.employeeID = employeeID;
            this.hireDate = hireDate;
            this.salary = salary;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
        }

        public String getHireDate() {
            return hireDate;
        }

        public void setHireDate(String hireDate) {
            this.hireDate = hireDate;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

    }
