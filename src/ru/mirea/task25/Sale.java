package ru.mirea.task25;

public class Sale implements Service{
    private int price;
    private String name;

    public Sale(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
