package edu.princeton.cs.introcs;

/*************************************************************************
 *  Compilation:  javac Clock.java
 *  Execution:    java Clock
 *  Dependencies: StdDraw.java
 *
 *************************************************************************/

public class Clock { 

    public static void main(String[] args) { 

        for (int t = 0; true; t++) {

            // remainder operator with doubles so all hands move every second
            double seconds = t % 60;
            double minutes = (t / 60.0) % 60;
            double hours   = (t / 3600.0) % 12;

            StdDraw.clear(StdDraw.LIGHT_GRAY);
            StdDraw.setPenRadius();

            // clock face
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(0.5, 0.5, 0.45);

            // hour markers
            StdDraw.setPenColor(StdDraw.BLUE);
            for (int i = 0; i < 12; i++) {
                double theta = Math.toRadians(i * 30);
                StdDraw.filledCircle(0.5 + 0.4 * Math.cos(theta), 0.5 + 0.4 * Math.sin(theta), .025);
            }

            // second hand
            StdDraw.setPenRadius(.01);
            StdDraw.setPenColor(StdDraw.YELLOW);
            double angle1 = Math.toRadians(6 * seconds);
            double r1 = 0.4;
            StdDraw.line(0.5, 0.5, 0.5 + r1 * Math.sin(angle1), 0.5 + r1 * Math.cos(angle1));

            // minute hand
            StdDraw.setPenRadius(.02);
            StdDraw.setPenColor(StdDraw.GRAY);
            double angle2 = Math.toRadians(6 * minutes);
            double r2 = 0.3;
            StdDraw.line(0.5, 0.5, 0.5 + r2 * Math.sin(angle2), 0.5 + r2 * Math.cos(angle2));

            // hour hand
            StdDraw.setPenRadius(.025);
            StdDraw.setPenColor(StdDraw.WHITE);
            double angle3 = Math.toRadians(30 * hours);
            double r3 = 0.2;
            StdDraw.line(0.5, 0.5, 0.5 + r3 * Math.sin(angle3), 0.5 + r3 * Math.cos(angle3));

            // digital time
            int second = t          % 60;
            int minute = (t / 60)   % 60;
            int hour   = (t / 3600) % 12;
            String time = String.format("%2d:%02d:%02d", hour, minute, second);
            StdDraw.setPenColor(StdDraw.BOOK_RED);
            StdDraw.text(0.5, 0.0, time);

            // 1000 miliseconds = 1 second
            StdDraw.show(1000);
        }
    }

}
