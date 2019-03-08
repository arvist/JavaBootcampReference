package com.accenture.bootcamp.java.topic03;

public class BranchingStatements {

    private static int VOTING_AGE_LIMIT = 18;
    private static int DRIVING_AGE_LIMIT = 18;
    private static int PROVISIONAL_DRIVING_AGE_LIMIT = 16;

    public static void main(String[] args){


        int myAge = 18;

        //Simple IF-ELSE branching statement
        if(myAge >= VOTING_AGE_LIMIT){
            System.out.println("Congrats you can participate in elections");
        } else {
            System.out.println("Sorry, you can't participate in elections");
        }

        //IF-ELSE IF-ELSE statement - there can be zero, one or more else-if blocks
        if(myAge >= DRIVING_AGE_LIMIT){
            System.out.println("Congrats you get your drivers license");
        } else if(myAge >= PROVISIONAL_DRIVING_AGE_LIMIT) {
            System.out.println("Congrats, you'll soon be able to get your drivers license, start practicing...");
        } else {
            System.out.println("Sorry, driving a car is something that you won't be experiencing for quite some time...");
        }



        //Switch statement with enum variable
        if(myAge >= DRIVING_AGE_LIMIT){
            Days myExamDay = Days.WEDNESDAY;

            switch (myExamDay){
                case MONDAY:
                    System.out.println(Days.MONDAY + " is the worst day for drivers exam");
                    break;
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                    System.out.println(myExamDay + " is a descent day for drivers exam");
                    break;
                case FRIDAY:
                    System.out.println(Days.FRIDAY + " is a the best day for drivers exam");
                    break;
                default:
                    System.out.println("Liar, you can't do drivers exam on " + myExamDay);
                    break;

            }
        }



    }

    enum Days {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
}
