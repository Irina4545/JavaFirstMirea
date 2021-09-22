package ru.mirea.task7.opt1;

public  class Rectangle extends Shape {public Rectangle(String color, boolean filled){super(color,filled);}
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea(){
        return width*length;
    }

    double getPerimeter() {
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
