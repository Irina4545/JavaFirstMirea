package ru.mirea.task25;

public class Test {
    public static void main (String[] args){
        System.out.println("Вычислим общую стоимость покупки акции и её 'акционерной безопасности'");
        Service buy = new Buy(2000,"Samsung");
        Service bonuses = new Bonuses(buy);
        System.out.println(bonuses.getName()+"\n"+"Общая стоимость заказа:"+bonuses.getPrice());

    }
}
