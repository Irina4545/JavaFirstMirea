package ru.mirea.task30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoTest {

    private String name = "�����";
    private int id=234;
    private int age=20;

    @org.junit.jupiter.api.Test
    void to() {
        System.out.println("������ ������������� ������������������ � �������\n" +
                this.name + ", �������:" +
                this.age + "\n����� �������� �� id:"+this.id);
    }
}