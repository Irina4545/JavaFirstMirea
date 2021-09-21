package ru.mirea.task6.opt2;

public class BlackJeans extends Shop implements Priceable {
    public BlackJeans(String model, int price) {
        super(model,  price);
    }
    public void info(){
        System.out.println("Цвет:"+super.getModel()+". Цена(руб.)"+super.getPrice());
    }

    @Override
    public int motLot() {
        return 0;
    }
}
