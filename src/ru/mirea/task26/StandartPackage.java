package ru.mirea.task26;

public class StandartPackage implements BonusesStrategy{
    @Override
    public void bonuses() {
        System.out.println("'Акционерная безопасность' не предусмотрены");
    }
}
