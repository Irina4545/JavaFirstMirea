package ru.mirea.task17.opt;

public enum Securities {
    Lukoil(12, 103), Rosneft(15, 20),
    Sber(45, 40), MTS(50, 15),
    Magnit(20, 110), VTB(60, 10);

    private int i;
    private int cost;

    Securities(int i, int cost) {
        this.i = i;
        this.cost = cost;
    }

    public int getI() {
        return i;
    }

    public int getCost() {
        return cost;
    }
}
