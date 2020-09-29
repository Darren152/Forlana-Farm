package com.employee.pay;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int paymentPerHour){
        super(name,paymentPerHour);
    }

    public int calculateSalary() {
        return getPaymentPerHour() * 40;
    }

}
