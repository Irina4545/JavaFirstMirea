package ru.mirea.task26;

public class PremiumPackage implements BonusesStrategy{
    @Override
    public void bonuses() {
        System.out.println("'Акционерная безопасность' предусмотрена, стоимость 1000");
    }
}
