package ru.mirea.task7.opt1;

public class Circle extends Shape {public Circle(String color, boolean filled){super(color,filled);}
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }

    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
