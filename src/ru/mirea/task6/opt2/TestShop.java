package ru.mirea.task6.opt2;

public class TestShop {
    public static void main(String[] args)
    {
        Shop s1=new BlackJeans("Черные",  1800);
        s1.info();
        if (s1 instanceof Priceable){
            int k=((Priceable)s1).motLot();
            System.out.println("Есть в наличии");
        }else
            System.out.println("Нет в наличии");
        Shop s2=new BlueJeans("Синие",1500);
        s2.info();
        if (s2 instanceof Priceable){
            int k=((Priceable)s2).motLot();
            System.out.println("Есть в наличии");
        }else
            System.out.println("Нет в наличии");
    }
}
