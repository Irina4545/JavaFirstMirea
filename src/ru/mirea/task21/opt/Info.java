package ru.mirea.task21.opt;

//определяем класс, который будет в основной программе работать с определением данных

public class Info<T> {
    private final T info;

    public Info(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}
