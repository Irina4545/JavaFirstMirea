package ru.mirea.task6.opt2;

public class BlackJeans extends Shop  {
    public BlackJeans(String model, int price) {
        super(model,  price);
    }
    public void info(){
        System.out.println("Цвет:"+super.getModel()+". Цена(руб.)"+super.getPrice());
    }
}
