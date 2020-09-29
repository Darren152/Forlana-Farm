package com.employee.pay;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Contractor("Greg", 70, 40);
        Employee e2 = new FullTimeEmployee("Darren", 45);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);

        System.out.println(e1.getPaymentPerHour());
        System.out.println(e2.getPaymentPerHour());
        System.out.println(e1.calculateSalary()*52);
        System.out.println(e2.calculateSalary()*52);
    }
}
