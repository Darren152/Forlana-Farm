package com.assessment;

public class SalariedEmployee extends Employee implements IPayable, NotPayable{
    private int salary;

    public SalariedEmployee(String name, HireDate[] hireDates, int salary) {
        super(name, hireDates);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void payAble() {
        System.out.println(salary/52);
    }

    @Override
    void getClassName() {
        System.out.println(getClass().getSimpleName());
    }
}
