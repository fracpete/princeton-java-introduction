package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac DigitReverser.java
 *  Execution:    java DigitReverser N
 *  
 *  Reverses the digits of a positive integer N using arithmetic. Then,
 *  reverse it again using string concatenation.
 *
 *  % java DigitReverser 12345
 *  54321
 *  12345
 *
 *************************************************************************/

public class DigitReverser {

   public static void main(String[] args) { 
      int N = Integer.parseInt(args[0]);        // original integer

      // reverse using arithmetic
      int M = 0;
      while (N != 0) {
         M = (10 * M) + (N % 10);
         N = N / 10;
      }
      System.out.println(M);


      // reverse again using string concatenation
      String s = "";
      while (M != 0) {
         int digit = M % 10;
         s = s + digit;
         M = M / 10;
      }
      System.out.println(s);

   }
}
