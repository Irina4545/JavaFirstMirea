package ru.mirea.task29;

import java.io.Serializable;

public class Buy implements Serializable {

    private static final long serialVersionUID = 1L;

    private int price;
    private String name;
    private int account=100000;

    public Buy(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getBuy(){
        return account-price;
    }

    @Override
    public String toString() {
        return "Вы приобрели акцию "+name+" стоимостью "+ price;
    }
}
