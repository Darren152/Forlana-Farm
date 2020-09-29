package com.employee.pay;

public abstract class Employee {
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public  abstract int calculateSalary();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPaymentPerHour(){
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", paymentPerHour=" + paymentPerHour +
                '}';
    }
}
