package com.company;

public class MyPoint {

    private double x;
    private double y;
    private double distance;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }



    public double getDistance(MyPoint p1) {
        double difX = this.x - p1.getX();
        double difY = this.y - p1.getY();

        double distance = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));

        return distance;
    }

}
