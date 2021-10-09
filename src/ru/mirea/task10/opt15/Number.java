package ru.mirea.task10.opt15;

public class Number {
    static void num(int x) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int result = 0;
        if (x != 0) {
            result = x % 10;
            System.out.print(result+" ");
            x /= 10;
            num(x);
        }
    }
    public static void main(String[]args)
    {
        num(345);
    }
}
