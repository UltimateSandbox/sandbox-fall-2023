package org.example.project1notes;

public class Point {

    private double x;
    private double y;

    // This is an example of how to implement the rotate method with Math

    public void rotate(double theta) {

        double x1 = x;
        double y1 = y;

        this.x = x1 * Math.cos(theta) - y1 * Math.sin(theta);


    }
}
