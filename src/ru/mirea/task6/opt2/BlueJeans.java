package ru.mirea.task6.opt2;

public class BlueJeans extends Shop implements Priceable {
    public BlueJeans(String model,  int price) {
        super(model,  price);
    }
        public void info(){
            System.out.println("Цвет:"+super.getModel()+". Цена(руб.)"+super.getPrice());
        }
        public int getLot(){
            return 0;
        }
    }
