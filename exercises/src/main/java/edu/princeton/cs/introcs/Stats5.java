package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Stats5.java
 *  Execution:    java Stats5
 *  
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, min value, and max value.
 *
 *  % java Stats5
 *
 *  0.7203537279117841
 *  0.09574435157738448
 *  0.8979741693231866
 *  0.11949032184355113
 *  0.23425519545397544
 *  Average = 0.4135635532219763
 *  Min     = 0.09574435157738448
 *  Max     = 0.8979741693231866
 *
 *  % java Stats5
 *  0.25523821773554134
 *  0.6577131932424987
 *  0.14170223533941984
 *  0.2653444869526621
 *  0.895374957216799
 *  Average = 0.44307461809738424
 *  Min     = 0.14170223533941984
 *  Max     = 0.895374957216799
 *
 *************************************************************************/

public class Stats5 { 
    public static void main(String[] args) { 
        int N = 5;
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        // print 5 values
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        // compute stats
        double min     = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        double max     = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
        double average = (x1 + x2 + x3 + x4 + x5) / N;

        // print stats
        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}
