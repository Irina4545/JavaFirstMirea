package ru.mirea.task10.opt14;

import java.util.Scanner;

public class Number {

    public static String solution(int n){

        if(n < 10)
            return Integer.toString(n);
        else
            return solution(n/10) + " " + n % 10;
    }

    public static void main(String[] args){
        System.out.println("Введите Ваше число N: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
