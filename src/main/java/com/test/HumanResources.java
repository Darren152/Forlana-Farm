package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class HumanResources{

    public void issueBadge(Employee[] a){
        for (Employee employees: a) {
            System.out.println(employees.getName());
            System.out.println("Type of employee: "+employees.getClass().getSimpleName());
            System.out.println(employees.getHireDate());
            System.out.println("");
        }
    }

    public void printPaymentInfo(Person a){
        System.out.println(a.getName()+"'s"+" Payment Info");
        System.out.println("------------------------------------");
        a.Pay();
        a.calculatePay();
    }

    public void payPerson(Person[] a){
        for(Person people: a){
            System.out.println(people.getName()+"'s"+" Payment Info");
            System.out.println("------------------------------------");
            System.out.println(people.Pay());
            people.calculatePay();
            System.out.println("");
        }
    }

    public void thisWeeksCheck(Person[] a){
        for(Person people: a){
            System.out.print(people.getClass().getSimpleName()+ " should be paid : ");
            System.out.println(people.Pay());
        }
    }

    public void sortByIncome(ArrayList<Person> a){

    }
}
