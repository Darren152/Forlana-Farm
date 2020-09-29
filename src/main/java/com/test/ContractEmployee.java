package com.test;

public class ContractEmployee extends Employee{

    private int hoursWorked;
    private int hourlyPay;

    public ContractEmployee(String name, HireDate hireDate, int hoursWorked, int hourlyPay) {
        super(name, hireDate);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

    @Override
    int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    int getHourlyPay() {
        return hourlyPay;
    }

    @Override
    void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    @Override
    public int Pay() {
        //System.out.println((hoursWorked*hourlyPay*2));
        return hoursWorked*hourlyPay*2;
    }

    @Override
    public void calculatePay() {
        System.out.println("Bi Weekly Check: "+hoursWorked*hourlyPay*2);
    }

    @Override
    public String toString() {
        return  getName()+ "\n"+
                "Type of employee: Contract Employee \n"+
                getHireDate();
    }
}
