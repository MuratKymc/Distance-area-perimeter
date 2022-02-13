package com.company;

public class Main {

    public static void main(String[] args) {

        MyPoint m1 = new MyPoint (3,0);
        MyPoint m2 = new MyPoint (0,4);
        MyPoint m3 = new MyPoint ();

        m2.getDistance(m3);
        System.out.println("Distance of two point : "+ m2.getDistance(m3));

        Triangel t1 = new Triangel(m1,m2,m3);
        System.out.println();

        Circle c1 = new Circle(3,m1);

    }
}
