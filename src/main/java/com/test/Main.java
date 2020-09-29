package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<Person> {

    public static void main(String[] args) {

        Investor[] investors = new Investor[2];
        investors[0] = new Investor("Josh", 20000, 4);
        investors[1] = new Investor("King", 54550, 7);

        Employee[] team1 = new Employee[2];
        team1[0] = new ContractEmployee("Jacob", new HireDate(3, 22, 2000), 40, 22);
        team1[1] = new SalariedEmployee("John", new HireDate(3, 22, 2000), 55000);

        System.out.println(investors[0]);
        investors[0].calculatePay();
        System.out.println("");

        System.out.println(investors[1]);
        investors[1].calculatePay();
        System.out.println("");

        System.out.println(team1[0]);
        team1[0].calculatePay();
        System.out.println("");
        System.out.println(team1[1]);
        team1[1].calculatePay();
        System.out.println("");

        Person person = new SalariedEmployee("David", new HireDate(3, 24, 2000), 74000);

        Person[] people = new Person[team1.length + investors.length];
        people[0] = new ContractEmployee("Jacob", new HireDate(3, 22, 2000), 40, 22);
        people[1] = new SalariedEmployee("John", new HireDate(3, 22, 2000), 55000);
        people[2] = new Investor("Josh", 20000, 4);
        people[3] = new Investor("King", 54550, 7);

        HumanResources human = new HumanResources();

        human.issueBadge(team1);
        System.out.println("");
        human.printPaymentInfo(person);
        System.out.println("");
        human.payPerson(people);
        System.out.println("");
        human.thisWeeksCheck(people);


        List<Person> people2 = new ArrayList<>();
        people2.add(0, new ContractEmployee("Abagail", new HireDate(3, 22, 2000), 40, 22));
        people2.add(1, new SalariedEmployee("AAhn", new HireDate(3, 22, 2000), 55000));
        people2.add(2, new Investor("Corey", 20000, 4));
        people2.add(3, new Investor("King", 54550, 7));


        System.out.println("Before Sorting:");
        for(Person a: people2){
            System.out.println(a);
            System.out.println("");
        }
        System.out.println("");
        people2.sort(new Main());
        System.out.println("After Sorting: ");
        for(Person a: people2){
            System.out.println(a);
            System.out.println(a.Pay());
            System.out.println("");
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.Pay(), o2.Pay());
    }
}
