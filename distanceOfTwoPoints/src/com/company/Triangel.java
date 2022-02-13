package com.company;

public class Triangel {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;
    private double perimeter;

    public Triangel(MyPoint p1, MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        calculatePerimeter();
        System.out.println("Perimeter of triangle : " + getPerimeter());
    }

    public MyPoint getP1(){
        return this.p1;
    }
    public MyPoint getP2(){
        return this.p2;
    }
    public MyPoint getP3(){
        return this.p3;
    }

    public void calculatePerimeter(){
        double edge12 = this.p1.getDistance(p2);
        double edge13 = this.p1.getDistance(p3);
        double edge23 = this.p2.getDistance(p3);
        this.perimeter = edge12 + edge13 + edge23;
    }

    public double getPerimeter(){
        return this.perimeter;
    }


}
