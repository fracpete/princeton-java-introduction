package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac SumOfTwoDice.java
 *  Execution:    java SumOfTwoDice
 *  
 *  Generate 2 integers between 1 and 6, and print their sum.
 * 
 *  %  java SumOfTwoDice
 *  5
 *
 *  %  java SumOfTwoDice
 *  9
 *
 *  %  java SumOfTwoDice
 *  3
 *
 *  %  java SumOfTwoDice
 *  11
 *
 *  %  java SumOfTwoDice
 *  8
 *
 *  %  java SumOfTwoDice
 *  7
 *
 *************************************************************************/

public class SumOfTwoDice { 
    public static void main(String[] args) {
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        System.out.println(sum);
    }
}
