package com.test;

public class SalariedEmployee extends Employee{

    private int salary;

    public SalariedEmployee(String name, HireDate hireDate, int salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int Pay() {
        //System.out.println((salary/26));
        return salary/26;
    }

    @Override
    public void calculatePay() {
        System.out.println("Salary: "+salary);
        System.out.println("Bi Weekly Check: "+salary/26);
    }

    @Override
    public String toString() {
        return  getName()+ "\n"+
                "Type of employee: Salaried Employee \n"+
                getHireDate();
    }

    @Override
    int getHoursWorked() {
        return 0;
    }

    @Override
    void setHoursWorked(int hoursWorked) {

    }

    @Override
    int getHourlyPay() {
        return 0;
    }

    @Override
    void setHourlyPay(int hourlyPay) {

    }


}
