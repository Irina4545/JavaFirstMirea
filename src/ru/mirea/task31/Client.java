package ru.mirea.task31;
//класс для получения данных клиентов системы

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
        return "Имя клиента:" +name+"\n"+
                "Дата рождения:" + data + "\n" +
                "Кол-во активных акций:" + stocks +"\n"+
                "Баланс: " + price + "P  "+ price/74 + "$";
    }

    public String getMenu(){
        return "1-Данные сотрудка для обращений\n" +
                "2-Покупка акций\n"+
                "3-Покупка ценных бумаг\n"+
                "4-Продажа акций\n"+
                "5-Продажа ценных бумаг\n";
    }


}

