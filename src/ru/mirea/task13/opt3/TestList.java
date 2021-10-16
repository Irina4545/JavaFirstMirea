package ru.mirea.task13.opt3;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args){
        MyArrayList list;
        list=new MyArrayList();

        list.add("Men");
        list.add(1234);
        System.out.println("Данные в хранилище в количестве:"+list.size());
        System.out.println("Элементы из хранилища:"+list.get(1)+","+list.get(0));

        list.remove(0);
        System.out.println("Данные в хранилище в количестве:"+list.size());
    }
}
