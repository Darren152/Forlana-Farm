package com.assessment;

public class ContractEmployee extends Employee implements IPayable, NotPayable, Comparable<ContractEmployee>{
    private int hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, HireDate[] hireDates, int hourlyRate, int hoursWorked) {
        super(name, hireDates);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculatePay() {
        return this.getHoursWorked()*this.getHourlyRate()*52;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    @Override
    void getClassName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void payAble() {
        System.out.println(calculatePay()/52);
    }

    @Override
    public int compareTo(ContractEmployee contractEmployee) {
        return 0;
    }
}
