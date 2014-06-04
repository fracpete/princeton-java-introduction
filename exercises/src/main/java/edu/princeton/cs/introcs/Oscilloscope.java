package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Oscilloscope.java
 *  Execution:    java Oscilloscope A B wX wY phiX phiY
 *  Dependencies: StdDraw.java
 *
 *  Simluate the output of an oscilloscope. Assume that the vertical and
 *  horizontal inputs are sinusoidal.
 *
 *        x = A sin (wX + phiX)
 *        y = B sin (wY + phiY)
 *  
 *  % java Oscilloscope 1 1 2 3 20 45
 *
 *************************************************************************/

public class Oscilloscope {

   public static void main(String[] args) {
      StdDraw.setXscale(-1, +1);
      StdDraw.setYscale(-1, +1);

      double A    = Double.parseDouble(args[0]);    // amplitudes
      double B    = Double.parseDouble(args[1]);
      double wX   = Double.parseDouble(args[2]);    // angular frequencies
      double wY   = Double.parseDouble(args[3]);
      double phiX = Double.parseDouble(args[4]);    // phase factors
      double phiY = Double.parseDouble(args[5]);

      // convert from degrees to radians
      phiY = Math.toRadians(phiX);
      phiY = Math.toRadians(phiY);


      for (double t = 0.0; t < 10; t += 0.0001) {
         double x = A * Math.sin(wX * t + phiX);
         double y = B * Math.sin(wY * t + phiY);
         StdDraw.point(x, y);
         StdDraw.show(10);
      }

   }
   
}
