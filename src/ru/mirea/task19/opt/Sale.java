package ru.mirea.task19.opt;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) throws SaleException {
        System.out.println("Введите ваш логин:");
        Scanner scanner= new Scanner(System.in);
        String login= scanner.nextLine();
        System.out.println("Рады Вас видеть снова, "+login+", вы участвуйте в розыгреше скидки на акцию компании Apple.\n Введите любое число:");
        int a= scanner.nextInt();
        int b=10, c=0;
        if (a<=0){
            throw new SaleException("Is not correct");
        }
            c = b/a;
            System.out.println("Вы получили скидку в "+c+"%. Спасибо за участие!");
    }

}