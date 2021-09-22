package ru.mirea.task7.opt1;

public  class Square extends Shape{public Square(String color,boolean filled){super(color, filled);}

    double getArea() {
        return 0;
    }

    double getPerimeter() {
        return 0;
    }

    public double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    void setWight(double side){

    }
    void setLength(double side){

    }

    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}
