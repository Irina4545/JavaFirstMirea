package ru.mirea.task31;

import java.util.Date;
import java.util.Scanner;

public class Securities {
    public void buys(Client c1) {
        System.out.println("��������� ������ ������ � �������: Lukoil, Rosneft, Sber, VTB");
        Scanner scanner3 = new Scanner(System.in);
        String a = scanner3.nextLine();
        switch (a) {
            case "Lukoil" ,"Rosneft"-> {
                System.out.println("������ ����� �������:");
                System.out.println(c1.price - 4000);
                Date d1=new Date();
                System.out.println(d1);
            }
            case "Sber", "VTB" -> {
                System.out.println("������ ����� �������:");
                System.out.println(c1.price - 7000);
                Date d1=new Date();
                System.out.println(d1);
            }
        }
    }
    public void sells(Client c1){
        System.out.println("��������� ������ ������ ��� �������: Lukoil, Rosneft, Sber, VTB");
        Scanner scanner3 = new Scanner(System.in);
        String a = scanner3.nextLine();
        switch (a) {
            case "Lukoil" ,"Rosneft"-> {
                System.out.println("������ ����� �������:");
                System.out.println(c1.price +8100);
                Date d1=new Date();
                System.out.println(d1);
            }
            case "Sber", "VTB" -> {
                System.out.println("������ ����� �������:");
                System.out.println(c1.price +5900);
                Date d1=new Date();
                System.out.println(d1);
            }
        }
    }
}
