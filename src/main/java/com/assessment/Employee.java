package com.assessment;

import java.util.Arrays;

public class Employee extends Person implements IPayable, NotPayable{

    private HireDate[] hireDates;

    public Employee(String name, HireDate[] hireDates) {
        super(name);
        this.hireDates = hireDates;
    }

    public HireDate[] getHireDates() {
        return hireDates;
    }

    public void setHireDates(HireDate[] hireDates) {
        this.hireDates = hireDates;
    }

    public String printBadge(Person a){
        System.out.println("Name: " + getName());
        System.out.println("Type of employee: "+ getClass().getSimpleName());
        System.out.println(Arrays.toString(getHireDates()));
        return "";
    }

    void getClassName() {

    }

    @Override
    public void payAble() {
        System.out.println(calculatePay());
    }

    @Override
    public String toString() {
        return "Type of employee: " + getClass().getSimpleName() +"\n"+ Arrays.toString(getHireDates());
    }
}
