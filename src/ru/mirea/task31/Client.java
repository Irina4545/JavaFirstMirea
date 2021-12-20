package ru.mirea.task31;
//����� ��� ��������� ������ �������� �������

public class Client  {
    public String name;
    public String data;
    public int price;
    public int stocks;


    public Client(String name, int price, int stocks, String data) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
        this.data = data;
    }

    @Override
    public String toString() {
        return "��� �������:" +name+"\n"+
                "���� ��������:" + data + "\n" +
                "���-�� �������� �����:" + stocks +"\n"+
                "������: " + price + "P  "+ price/74 + "$";
    }

    public String getMenu(){
        return "1-������ �������� ��� ���������\n" +
                "2-������� �����\n"+
                "3-������� ������ �����\n"+
                "4-������� �����\n"+
                "5-������� ������ �����\n";
    }


}

