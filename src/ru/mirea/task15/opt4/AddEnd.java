package ru.mirea.task15.opt4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        try (FileWriter writer = new FileWriter("C:\\Users\\Ирина\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\test.txt", true)) {
            System.out.println("Введите информацию, которую необходимо передать в текстовый файл");
            text = scanner.nextLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
