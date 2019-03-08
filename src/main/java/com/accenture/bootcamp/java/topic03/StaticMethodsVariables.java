package com.accenture.bootcamp.java.topic03;

public class StaticMethodsVariables {

    //Static variables, shared across all instances
    private final static double PI = 3.14; //Constant field, same for all instances

    public static int objectConstructorCounter;

    static {
        objectConstructorCounter = 0;
    }

    //Class field - separate variable for each object
    private int id;


    //Constructor
    public StaticMethodsVariables(int id){
        this.id = id;
        objectConstructorCounter++;
    }


    //Class method - prints id for the particular instance
    public void printId(){
        System.out.println("ID " + id);
    }


    //Static method - prints contents of static field
    public static void printConstructorInvocationCounter(){
        System.out.println("Constructor invoked " + objectConstructorCounter + " number of times");
    }

    public static void main(String[] args){

        printConstructorInvocationCounter(); //This is a static method - we don't need object to call this method on

        StaticMethodsVariables obj0 = new StaticMethodsVariables(1); // 1
        StaticMethodsVariables obj1 = new StaticMethodsVariables(2); // 2
        StaticMethodsVariables obj2 = new StaticMethodsVariables(3); // 3

        //Method called by only using method name
        printConstructorInvocationCounter(); //Same as StaticMethodsVariables.printConstructorInvocationCounter();

        //Method called referencing the object for which we want to print the ID
        obj0.printId();
        obj2.printId();

    }

}
