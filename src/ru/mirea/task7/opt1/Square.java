package ru.mirea.task7.opt1;

public  class Square extends Rectangle{
    public Square(){super();}

    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {super(side,side,color, filled); }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWight(double side){
        setSide(side);
    }

    public void setLength(double side){
       setSide(side);
    }

    public String toString() {
        return super.toString();
    }
}
