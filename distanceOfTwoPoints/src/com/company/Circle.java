package com.company;

public class Circle {

    private double radius;
    private MyPoint center;
    private double area;
    private double perimeter;

    public  Circle(double radius, MyPoint center){
        this.radius = radius;
        this.center = center;
        calculateArea();
        calculatePerimeter();
        System.out.println("Area of circle : " + getArea());
        System.out.println("Perimeter of circle : " + getPerimeter());

    }

    public double getRadius(){
        return this.radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }

    public void calculateArea(){
        this.area = Math.PI * Math.pow(this.radius,2);
    }

    public double getArea(){
        return this.area;
    }

    public void calculatePerimeter(){
        this.perimeter = 2 * Math.PI * this.radius;
    }
    public double getPerimeter(){
        return this.perimeter;
    }


}
