package com.accenture.bootcamp.java.topic03;

public class LogicalComparisonOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 10;

        boolean aIsEqualToB = a == b;
        boolean aIsEqualToA = a == a;

        System.out.println("Number a = " + a + " b = " + b + " c = " + c);
        System.out.println("A is equal to B " + aIsEqualToB);
        System.out.println("A is equal to A " + aIsEqualToA);

        boolean cIsTheLargestNum = a < c && b < c;
        System.out.println("C is largest of numbers " + cIsTheLargestNum);

        boolean cIsTheSmallestNum = !(a < c && b < c);
        System.out.println("C is the smallest of numbers " + cIsTheSmallestNum);
    }
}
