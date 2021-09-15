package ru.mirea.task6.opt1;

public class Earth extends lab2.Planet implements Sputnik{
    public Earth(int weight, String surname){super(weight, surname);}
    public void infoPlanet()
    {
        System.out.println("Вес "+super.getSurname()+" в тоннах:"+super.getWeight());
    }

    public int getSput() {
        return 0;
    }
}

