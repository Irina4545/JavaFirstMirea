package ru.mirea.task26;

public class Test {
    public static void main(String [] args){
        Securities lukoil = new Lukoil();
        Securities rosneft = new Rosneft();
        Securities magnit = new Magnit();

        lukoil.bonuses();
        rosneft.bonuses();
        magnit.bonuses();
    }
}
