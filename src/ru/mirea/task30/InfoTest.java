package ru.mirea.task30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoTest {

    private String name = "Ирина";
    private int id=234;
    private int age=20;

    @org.junit.jupiter.api.Test
    void to() {
        System.out.println("Данные пользователей зарегистрированных в системе\n" +
                this.name + ", возраст:" +
                this.age + "\nПоиск возможен по id:"+this.id);
    }
}