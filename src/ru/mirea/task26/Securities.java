package ru.mirea.task26;

public class Securities {
    BonusesStrategy bonusesStrategy;

    public void profit(){
        System.out.println("Можно получить прибыль");
    }

    public void refund(){
        System.out.println("Можно вернуть занятую сумму");
    }

    public void bonuses(){
        bonusesStrategy.bonuses();
    }
}
class Lukoil extends Securities{
    public Lukoil(){
        this.bonusesStrategy = new PremiumPackage();
    }
}

class Rosneft extends Securities{
    public Rosneft(){
        this.bonusesStrategy = new PremiumPackage();
    }
}

class  Magnit extends Securities{
    public Magnit(){
        this.bonusesStrategy = new StandartPackage();
    }
}