package com.accenture.bootcamp.java.topic03;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a, b;
        a = 4;
        b = 5;
        //Addition
        int additionResult = a + b;
        //Subtract
        int subtractResult = a - b;
        //Divide
        double divideResultWhole = a / b;       //a and b variables are whole numbers, division result is also whole number
        double divideResultFull = a * 1.0f / b; //one of variables is converted to floating point number, division result is with decimal places
        //Multiplication
        double multiplicationResult = a*b;
        //Modulo - reminder of division
        int moduloResult = a % b;

        System.out.println("Number a = " + a + " number b = " + b);
        System.out.println("Addition result = " + additionResult);
        System.out.println("Subtraction result = " + subtractResult);
        System.out.println("Division (whole) result = " + divideResultWhole);
        System.out.println("Division result = " + divideResultFull);
        System.out.println("Multiplication result = " + multiplicationResult);
        System.out.println("Reminder of division = " + moduloResult );



    }
}
