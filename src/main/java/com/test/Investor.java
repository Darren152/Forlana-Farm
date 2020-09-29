package com.test;

public class Investor extends Person{

    private int amountInvested;
    private int yearsInvested;

    public Investor(String name, int amountInvested, int yearsInvested) {
        super(name);
        this.amountInvested = amountInvested;
        this.yearsInvested = yearsInvested;
    }


    public int getAmountInvested() {
        return amountInvested;
    }

    public void setAmountInvested(int amountInvested) {
        this.amountInvested = amountInvested;
    }

    public int getYearsInvested() {
        return yearsInvested;
    }

    public void setYearsInvested(int yearsInvested) {
        this.yearsInvested = yearsInvested;
    }


    @Override
    public int Pay() {
        int check = (int)((amountInvested*.22*yearsInvested)/26);
//        System.out.println(check);
        return check;
    }

    @Override
    public void calculatePay() {
        int gained = (int) (amountInvested * .22 * yearsInvested);
        int check = (int)((amountInvested*.22*yearsInvested)/26);
        System.out.println("Bi Weekly Check: "+ check);
        System.out.println("Gained: "+ gained);
    }

    @Override
    public String toString() {
        return  "Investor: " + getName()+
                "\nAmount Invested: " + amountInvested +
                "  |  Years Invested: " + yearsInvested;
    }
}
