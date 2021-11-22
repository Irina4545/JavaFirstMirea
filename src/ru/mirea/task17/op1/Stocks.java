package ru.mirea.task17.op1;

public enum Stocks {
    Apple(10, 150, "privilege"), Samsung(15, 136, "privilege"),
    Adidas(45, 98, "normal"), BMW(50, 110, "normal"),
    COCACOLA(24, 100, "normal"), Columbia(18, 114, "normal"),
    eHealth(65, 134, "normal"), Ford(43, 138, "privilege"),
    Sber(12, 189, "privilege"), Tinkoff(11, 143, "privilege");

    private int i;
    private int cost;
    private String status;

    Stocks(int i, int cost, String status) {
        this.i = i;
        this.status = status;
        this.cost = cost;
    }

    public int getI() {
        return i;
    }

    public int getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }


}
