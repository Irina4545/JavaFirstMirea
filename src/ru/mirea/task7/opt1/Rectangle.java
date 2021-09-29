package ru.mirea.task7.opt1;

public  class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public Rectangle(double width,double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width,double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" +super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                '}';
    }
}
