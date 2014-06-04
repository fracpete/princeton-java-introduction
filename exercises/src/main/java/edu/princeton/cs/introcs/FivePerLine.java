package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac FivePerLine.java
 *  Execution:    java FivePerLine
 *  
 *  Print the integers from 1000 to 2000, 5 per line.
 *
 *  % java FivePerLine
 *
 *************************************************************************/

public class FivePerLine { 

   public static void main(String[] args) {

       // print integers from 1000 to 2000, 5 per line
       int start = 1000, end = 2000;
       for (int i = start; i <= end; i++) {
          System.out.print(i + " ");
          if (i % 5 == 4) System.out.println();
       }
       System.out.println();

   }
}
