package ru.mirea.task15.opt2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        try (FileReader reader = new FileReader("C:\\\\Users\\\\Ирина\\\\IdeaProjects\\\\JavaFirstMirea\\\\src\\\\ru\\\\mirea\\\\task15\\\\test.txt\"")){
            System.out.println("Из файла получен текст: ");
            int c;
            while ((c = reader.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
