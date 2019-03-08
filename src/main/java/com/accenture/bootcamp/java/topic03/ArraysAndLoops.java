package com.accenture.bootcamp.java.topic03;

public class ArraysAndLoops {

    public static void main(String[] args) {

        //Creating new integer array with initial values
        int[] intArray0 = {1, 2, 9, 0, 5};

        //Accessing array elements by index, first element index = 0, last element index = size-1
        System.out.println("Element with index 0 is " + intArray0[0]);
        System.out.println("Last element in array is " + intArray0[intArray0.length - 1]);

        //Creating empty integer array with size of 10
        int[] intArray1 = new int[3];

        //Setting element to value by index
        intArray1[1] = 99;

        //Looping through whole array and accessing the elements one by one
        for (int i = 0; i < intArray1.length; i++) {
            System.out.println("Index " + i + " element = " + intArray1[i]);
        }

        //Creating empty array for reference types
        Person[] personArray = new Person[3];
        personArray[0] = new Person("John",19);
        personArray[2] = new Person("Jane",20);


        //Looping through array elements
        for(Person person : personArray){
            System.out.println(person);
        }

    }

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
