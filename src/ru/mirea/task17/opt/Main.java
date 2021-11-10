package ru.mirea.task17.opt;

public class Main { public static void main(String[] args) {
    for (Securities element:Securities.values()){
        System.out.println("Info:\n"+element+"\n"+element.getI()+"-lot\n"+element.getCost()+"-price");
        }
}
}
