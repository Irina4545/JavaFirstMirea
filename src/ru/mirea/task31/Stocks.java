package ru.mirea.task31;

import java.util.Date;
import java.util.Scanner;

public class Stocks {
    public void buy(Client c1) {
        System.out.println("Доступные акции к покупке: Samsung, Apple, MTS, Magnit");
        Scanner scanner3 = new Scanner(System.in);
        String a = scanner3.nextLine();
        switch (a) {
            case "Samsung" ,"MTS"-> {
                System.out.println("Баланс после покупки:");
                System.out.println(c1.price - 8000);
                Date d1=new Date();
                System.out.println(d1);
            }
            case "Apple", "Magnit" -> {
                System.out.println("Баланс после покупки:");
                System.out.println(c1.price - 5500);
                Date d1=new Date();
                System.out.println(d1);
            }
        }
    }
    public void sell(Client c1){
        System.out.println("Доступные акции для продажи: Samsung, Apple, MTS, Magnit");
        Scanner scanner3 = new Scanner(System.in);
        String a = scanner3.nextLine();
        switch (a) {
            case "Samsung" ,"MTS"-> {
                System.out.println("Баланс после продажи:");
                System.out.println(c1.price +8100);
                Date d1=new Date();
                System.out.println(d1);
            }
            case "Apple", "Magnit" -> {
                System.out.println("Баланс после продажи:");
                System.out.println(c1.price +5900);
                Date d1=new Date();
                System.out.println(d1);
            }
        }
   }
}
