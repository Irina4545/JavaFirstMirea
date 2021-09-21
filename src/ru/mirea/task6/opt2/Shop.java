package ru.mirea.task6.opt2;

public abstract class Shop {
    String model;
    int price;

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


    public Shop(String model,  int price) {
        this.model = model;
        this.price = price;
    }

    public abstract void info();
}
