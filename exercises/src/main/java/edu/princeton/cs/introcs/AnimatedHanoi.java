package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac AnimatedHanoi.java
 *  Execution:    java AnimatedHanoi N
 *  Dependencies: StdDraw.java
 *  
 *  Solves the Towers of Hanoi problem on N discs and displays the
 *  results graphically.
 *
 *
 *  % java AnimatedHanoi 6
 *
 *************************************************************************/

import java.awt.Color;

public class AnimatedHanoi {

   // draw the current state of the Towers of Hanoi game
   public static void draw(int[] pole) {

      int N = pole.length - 1;

      // draw 3 poles
      StdDraw.clear();
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.setPenRadius(0.002);
      for (int i = 0; i < 3; i++)
         StdDraw.line(i, 0, i, N);

      // draw N discs
      int[] discs = new int[3];   // discs[p] = # discs on pole p
      for (int i = N; i >= 1; i--) {
         Color color = Color.getHSBColor(1.0f * i / N, .7f, .7f);
         StdDraw.setPenColor(color);
         StdDraw.setPenRadius(0.035);   // magic constant
         double size = 0.5 * i / N;
         int p = pole[i];
         StdDraw.line(p-size/2, discs[p], p + size/2, discs[p]);
         ++discs[p];
      }

      StdDraw.show(500);
   }

   public static void hanoi(int N) {
      int[] pole = new int[N+1];       // pole[i] = pole (0-2) that disc i is on
      draw(pole);
      hanoi(N, 0, 1, 2, pole);
   }

   public static void hanoi(int n, int from, int temp, int to, int[] pole) {
      if (n == 0) return;
      hanoi(n-1, from, to, temp, pole);
      System.out.println("Move disc " + n + " from pole " + from + " to pole " + to);
      pole[n] = to;
      draw(pole);
      hanoi(n-1, temp, from, to, pole);
   }

   public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);   // number of discs
      int WIDTH  = 200;                    // width of largest disc
      int HEIGHT = 20;                     // height of each disc

      // set size of window and sale
      StdDraw.setCanvasSize(4*WIDTH, (N+3)*HEIGHT);
      StdDraw.setXscale(-1, 3);
      StdDraw.setYscale(0, N+3);

      // solve the Towers of Hanoi with N discs
      hanoi(N);
   }
}
