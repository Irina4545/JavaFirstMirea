package ru.mirea.task31;

import java.util.Scanner;

//����� ��� ������������� ������ ���������� �����

public class inputSystem  {
    public static void main(String[] args){
        System.out.println("����� ���������� � ����");
        System.out.println("������� ��� ������");
        Scanner scanner1 = new Scanner(System.in);
        Integer password = scanner1.nextInt();

        switch (password){
            case 1234 -> {
                Client c1 = new Client("�������� ����� ���������", 100000, 3, "22.08.2001");
                System.out.println(c1.toString());
                while (true) {
                    System.out.println("����\n" + c1.getMenu());
                    Scanner scanner2 = new Scanner(System.in);
                    Integer menu = scanner2.nextInt();
                    if (menu==1){
                        System.out.println("������ ���� ��������\n" +
                                "8-800-90-45-234");
                        System.out.println("�������� �������� ��� ������� '0' ��� ������");

                    }else if (menu==2){
                        Stocks s1 = new Stocks();
                        s1.buy(c1);

                    }else if (menu==3){
                        Stocks s2 = new Stocks();
                        s2.sell(c1);

                    }else if (menu==4){
                        Securities s3 = new Securities();
                        s3.buys(c1);

                    }else  if (menu==5){
                        Securities s4 = new Securities();
                        s4.sells(c1);

                    }else break;
                }
            }
            case 1593 ->{
                Client c1=new Client("���������� ���� �������������", 500000, 20,"15.08.1952" );
                System.out.println(c1.toString());
                while (true) {
                    System.out.println("����\n" + c1.getMenu());
                    Scanner scanner2 = new Scanner(System.in);
                    Integer menu = scanner2.nextInt();
                    if (menu==1){
                        System.out.println("������ ���� ��������\n" +
                                "8-800-90-45-234");
                        System.out.println("�������� �������� ��� ������� '0' ��� ������");

                    }else if (menu==2){
                        Stocks s1 = new Stocks();
                        s1.buy(c1);

                    }else if (menu==3){
                        Stocks s2 = new Stocks();
                        s2.sell(c1);

                    }else if (menu==4){
                        Securities s3 = new Securities();
                        s3.buys(c1);

                    }else  if (menu==5){
                        Securities s4 = new Securities();
                        s4.sells(c1);

                    }else break;
                }
            }
            case 2306 ->{
                Client c1=new Client("���������� ������� �������", 300000, 11,"01.02.1975" );
                System.out.println(c1.toString());
                while (true) {
                    System.out.println("����\n" + c1.getMenu());
                    Scanner scanner2 = new Scanner(System.in);
                    Integer menu = scanner2.nextInt();
                    if (menu==1){
                        System.out.println("������ ���� ��������\n" +
                                "8-800-90-45-234");
                        System.out.println("�������� �������� ��� ������� '0' ��� ������");

                    }else if (menu==2){
                        Stocks s1 = new Stocks();
                        s1.buy(c1);

                    }else if (menu==3){
                        Stocks s2 = new Stocks();
                        s2.sell(c1);

                    }else if (menu==4){
                        Securities s3 = new Securities();
                        s3.buys(c1);

                    }else  if (menu==5){
                        Securities s4 = new Securities();
                        s4.sells(c1);

                    }else break;
                }
            }
            case 7692 ->{
                Client c1=new Client("�������� ����� ���������", 50000, 5,"31.03.20012" );
                System.out.println(c1.toString());
                while (true) {
                    System.out.println("����\n" + c1.getMenu());
                    Scanner scanner2 = new Scanner(System.in);
                    Integer menu = scanner2.nextInt();
                    if (menu==1){
                        System.out.println("������ ���� ��������\n" +
                                "8-800-90-45-234");
                        System.out.println("�������� �������� ��� ������� '0' ��� ������");

                    }else if (menu==2){
                        Stocks s1 = new Stocks();
                        s1.buy(c1);

                    }else if (menu==3){
                        Stocks s2 = new Stocks();
                        s2.sell(c1);

                    }else if (menu==4){
                        Securities s3 = new Securities();
                        s3.buys(c1);

                    }else  if (menu==5){
                        Securities s4 = new Securities();
                        s4.sells(c1);

                    }else break;
                }
            }
        }
    }
}
