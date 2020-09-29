package com.assessment;

public class Person implements IPayable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculatePay(){
        return 0;
    }

    @Override
    public String toString() {
        return "Name: "+ name + '\n';
    }

    @Override
    public void payAble() {

    }
    void getClassName() {
    }
}
