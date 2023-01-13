package com.brideglabz.arrayprogram;

public class Factorial {
    public static void calculateFactorial(){
        int numberOfTime;
        long factorial=1;
        System.out.println();
        for (numberOfTime =1; numberOfTime<=10; numberOfTime++){
            factorial = factorial*numberOfTime;
            System.out.println(" factorial " +numberOfTime+ " is =  "+factorial);

        }

    }
    public static void main(String[] args) {
        System.out.println("---Welcome to the Factorial Program----");
        calculateFactorial();

    }
}
