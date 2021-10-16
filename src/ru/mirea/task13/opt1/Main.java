package ru.mirea.task13.opt1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList list;
        list=new ArrayList();
        System.out.println("Начальные данные");
        list.add("Ivan");
        list.add(1234);
        for (Object o:list) {
            System.out.println(o);
        }

        System.out.println("Измененные данные");
        list.add(1,"Ivanov");
        for (Object o:list) {
            System.out.println(o);
        }
        System.out.println("Размер до очистки: "+list.size());
        list.clear();
        System.out.println("Размер после очистки: "+list.size());

    }
}
