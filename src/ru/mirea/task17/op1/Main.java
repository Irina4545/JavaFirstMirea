package ru.mirea.task17.op1;

public class Main {
    public static void main(String[] args) {
        for (Stocks element:Stocks.values()){
            System.out.println("Info:\n"+element+"\n"+element.getI()+"-lot\n"+element.getStatus()+"-status\n"+element.getCost()+"-price");
            if (element.getStatus()=="normal"){
                System.out.println("Access is available");
            }
        }
    }
}
