package com.accenture.bootcamp.java.topic03;

public class SimpleTypes {

    static int wholeNumber;                    //class variable created but not explicitly initialized, default int value is set

    public static void main(String[] args){

        //This is single line comment

        /*
           This is
           block comment
         */

        int wholeNumberInitialized = 1;     //Variable explicitly initialized with value
        System.out.println("1. wholeNumber value is = " + wholeNumber + " \n wholeNumberInitialized = " + wholeNumberInitialized);

        //Change values for variables
        wholeNumber = 2;
        wholeNumberInitialized = 3;
        System.out.println("2. wholeNumber value is = " + wholeNumber + " \n wholeNumberInitialized = " + wholeNumberInitialized);


        float floatingPointNumber = 1.5f;
        boolean truthValue = true; //false
        char character = 'a';


    }
}
