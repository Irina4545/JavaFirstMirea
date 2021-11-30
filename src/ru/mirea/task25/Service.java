package ru.mirea.task25;

//пропишем интерфейс для покупки и продажи акций фондового банка через бонусный остаток
//за опции примем начисление в размере 1000 бонусов за продажи/покупки акций в "горящие" дни

public interface Service {
    public int getPrice();
    public String getName();
}
