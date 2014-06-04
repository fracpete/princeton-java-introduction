package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Ramanujan.java
 *  Execution:    java Ramanujan N
 *  
 *  Prints out any number between 1 and N that can be expressed as the
 *  sum of two cubes in two (or more) different ways.
 *
 *  % java Ramanujan 1728
 *
 *  % java Ramanujan 1729
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *
 *  % java Ramanujan 10000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *
 *  % java Ramanujan 100000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *  13832 = 2^3 + 24^3 = 18^3 + 20^3
 *  39312 = 2^3 + 34^3 = 15^3 + 33^3
 *  46683 = 3^3 + 36^3 = 27^3 + 30^3
 *  32832 = 4^3 + 32^3 = 18^3 + 30^3
 *  40033 = 9^3 + 34^3 = 16^3 + 33^3
 *  20683 = 10^3 + 27^3 = 19^3 + 24^3
 *  65728 = 12^3 + 40^3 = 31^3 + 33^3
 *  64232 = 17^3 + 39^3 = 26^3 + 36^3
 *
 *  % java Ramanujan 100000000 | sort -n   // sort results numerically in Unix
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  ...
 *  87539319 = 167^3 + 436^3 = 228^3 + 423^3
 *  87539319 = 167^3 + 436^3 = 255^3 + 414^3
 *  87539319 = 228^3 + 423^3 = 255^3 + 414^3
 *  ...
 *
 *  Bugs
 *  ----
 *  If a number can be expressed as a sum of cubes in more than two
 *  different ways, the program prints some duplicates.
 *
 *************************************************************************/

public class Ramanujan {

   public static void main(String[] args) { 

      // read in one command-line argument
      int N = Integer.parseInt(args[0]);

      // for each a, b, c, d, check whether a^3 + b^3 = c^3 + d^3
      for (int a = 1; a <= N; a++) {
         int a3 = a*a*a;
         if (a3 > N) break;

         // start at a to avoid print out duplicate
         for (int b = a; b <= N; b++) {
            int b3 = b*b*b;
            if (a3 + b3 > N) break;

            // start at a + 1 to avoid printing out duplicates
            for (int c = a + 1; c <= N; c++) {
               int c3 = c*c*c;
               if (c3 > a3 + b3) break;

               // start at c to avoid printing out duplicates
               for (int d = c; d <= N; d++) {
                  int d3 = d*d*d;
                  if (c3 + d3 > a3 + b3) break;

                  if (c3 + d3 == a3 + b3) {
                     System.out.print((a3+b3) + " = ");
                     System.out.print(a + "^3 + " + b + "^3 = "); 
                     System.out.print(c + "^3 + " + d + "^3"); 
                     System.out.println();
                  }
               }
            }
         }
      }
   }
}
