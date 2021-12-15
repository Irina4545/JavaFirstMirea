package ru.mirea.task30;

public class Info {
    private int id;
    private String name;
    private int age;

    public Info(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Данные пользователя:\n" +
                 this.name + ", возраст:" +
                 this.age + "\nПоиск возможен по id:"+this.id;
    }

}
