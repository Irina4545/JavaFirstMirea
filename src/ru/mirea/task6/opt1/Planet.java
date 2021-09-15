package ru.mirea.task6.opt1;

public abstract class Planet  {
        private int weight;
        private String surname;

        public int getWeight () {
            return weight;
        }

        public String getSurname()
        {
            return surname;
        }

    public Planet( int weight,String surname)
    {
            this.weight = weight;
            this.surname=surname;
    }
    public abstract void infoPlanet();
}
