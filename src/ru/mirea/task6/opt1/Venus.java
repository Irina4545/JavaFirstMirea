package ru.mirea.task6.opt1;

public class Venus extends Planet {
    public Venus(int weight, String surname){super(weight,surname);}
    public void infoPlanet()
    {
        System.out.println("Вес "+super.getSurname()+" в тоннах:"+super.getWeight());
    }
}
