package com.brideglabz.arrayprogram;

public class MultiplicationTable  {
    public static void main(String[] args) {
        System.out.println("welcome to the program");
        int number = Integer.parseInt(args[0]);
        for (int i =1; i<=10;i++){
            System.out.println(number+" * "+i+ "="+number*i);
        }

    }

}
//Take command line arguments Input number and print its multiplication table and storing the tables in an array