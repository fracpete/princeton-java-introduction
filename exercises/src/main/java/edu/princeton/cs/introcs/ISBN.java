package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac ISBN.java
 *  Execution:    java ISBN N
 *  
 *  Determines the check digit of an ISBN number given the first 9 digits.
 *
 *  An ISBN number is legal if it consists of 10 digits and
 *  d_1 + 2*d_2 + 3*d_3 + ... + 10*d_10 is a multiple of 11.
 *  For example, 0-201-31452-5 is legal since
 *  1*5 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 = 88
 *  and 88 is a multiple of 11.
 *
 *  Sample execution:
 *
 *       % java ISBN 020131452
 *       The full ISBN number is 201314525.
 *
 *************************************************************************/

public class ISBN {

   public static void main(String[] args) { 

      // read in one command-line argument
      int N = Integer.parseInt(args[0]);

      // compute the weighted sum of the digits, from right to left
      int sum = 0;
      for (int i = 2; i <= 10; i++) {
         int digit = N % 10;                // rightmost digit
         sum = sum + i * digit;
         N = N / 10;
      }
     
      // print out check digit, use X for 10
      System.out.print("The full ISBN number is " + args[0]);
      if      (sum % 11 == 1) System.out.println("X");
      else if (sum % 11 == 0) System.out.println("0");
      else                    System.out.println(11 - (sum % 11));
   }
}
