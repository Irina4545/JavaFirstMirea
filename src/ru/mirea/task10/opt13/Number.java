package ru.mirea.task10.opt13;

public class Number {
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);

        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            if (m > 0) {
                recursion();
            }
        }
        System.out.print(n + " ");
    }

    public static void main(String[]args)
    {
        recursion();
        System.out.print("- числа с нечетными номерами");

    }
}
