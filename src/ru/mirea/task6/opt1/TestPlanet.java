package ru.mirea.task6.opt1;

public class TestPlanet {
    public static void main(String[] args)
    {
    Planet p1=new Earth(6, "Земли");
    p1.infoPlanet();
        if (p1 instanceof Sputnik){
            int k=((Sputnik)p1).getSput();
            System.out.println("Имеет спутник");
        }else
            System.out.println("Спутника нет");
    Planet p2=new Venus(5, "Венеры");
    p2.infoPlanet();
        if (p2 instanceof Sputnik){
            int k=((Sputnik)p2).getSput();
            System.out.println("Имеет спутник");
        }else
            System.out.println("Спутника нет");
    }
}
