package com.assessment;

public class Investor extends Person implements IPayable, NotPayable{
    private int invested;
    private int months;

    public Investor(String name, int invested, int months) {
        super(name);
        this.invested = invested;
        this.months = months;
    }

    public int getInvested() {
        return invested;
    }

    public void setInvested(int invested) {
        this.invested = invested;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }


    @Override
    public int calculatePay() {
        int annual;
        annual = (int) ((getInvested()*getMonths())*.10);
        return annual;
    }

    @Override
    public String toString() {
        return "Entrepreneur{" +
                "invested=" + invested +
                ", months=" + months +
                '}';
    }

    @Override
    public void payAble() {
        System.out.println(calculatePay()/52);
    }

    @Override
    void getClassName() {
        System.out.println(getClass().getSimpleName());
    }
}
