package com.assessment;

import java.util.Arrays;
import java.util.List;

public class HumanResources {
    public void issueBadge(Employee[] a){

        for(Employee badge: a){
            System.out.println("BADGE");
            System.out.println(badge.printBadge(badge));
        }
    }

    public void printPaymentInfo(Person payable){

        for (int i = 0; i < 1; i++){
            NotPayable currentObject = (NotPayable) payable;

            if(currentObject != null){
                System.out.print(getClass().getSimpleName()+" should be paid : ");((IPayable) currentObject).payAble();
            }
        }
    }

    public void payPerson(List<Person> payable) {
        for (int i = 0; i < payable.size(); i++) {
            NotPayable currentObject = (NotPayable) payable;

            System.out.print(" should be paid : ");((IPayable) currentObject).payAble();
        }
    }
}
