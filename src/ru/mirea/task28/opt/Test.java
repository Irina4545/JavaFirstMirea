package ru.mirea.task28.opt;

import java.util.HashMap;

public class Test {
    public static void main(String [] args){
        Bank.Banker banker = new Bank.Banker();
        Bank bank = banker.createBank();
        HashMap<String, Bank.Account> b = new HashMap();

        bank.openAccount("084560","Irina");
        bank.putMoney("084560",15000);
        bank.buyStocks("084560",5000);

    }
}
