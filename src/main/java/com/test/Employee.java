package com.test;

public abstract class Employee extends Person {

    private HireDate hireDate;

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    abstract int getHoursWorked();

    abstract void setHoursWorked(int hoursWorked);

    abstract int getHourlyPay();

    abstract void setHourlyPay(int hourlyPay);

    public void setHireDate(HireDate hireDate) {
        this.hireDate = this.hireDate;
    }

}
