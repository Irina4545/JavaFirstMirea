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
        return "������ ������������:\n" +
                 this.name + ", �������:" +
                 this.age + "\n����� �������� �� id:"+this.id;
    }

}
