package ru.mirea.task29;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Какую акцию вы планируете приобрести?");

        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();

        Scanner scanner1=new Scanner(System.in);
        Integer price=scanner1.nextInt();

        Buy buy=new Buy(price,name);

        switch (name) {
            case "Samsung", "Apple", "MTS", "BMW" -> {
                System.out.println(buy.toString() + "\n На счету осталось: " + buy.getBuy());
                break;
            }
            default -> throw new IllegalStateException("Такой акции не существует: " + name);
        }

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ирина\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\text1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(buy);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ирина\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\text1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Buy buy1 = (Buy) objectInputStream.readObject();

        System.out.println("В системе сохранилась данная информация:\n"+buy1);
    }
}
