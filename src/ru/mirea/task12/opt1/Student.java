package ru.mirea.task12.opt1;

import java.util.Arrays;

public class Student {

    public static void main(String[] params){
        int [] iDNumber=new int[]{568, 10,569,100,34,23,44,12};
        System.out.println("ID-номера студентов до сортировки:");
        System.out.println(Arrays.toString(iDNumber));
        System.out.println("ID-номера студентов после сортировки:");
        Student(iDNumber);
        System.out.println(Arrays.toString(iDNumber));
    }

    public static void Student(int[] idNumber){
        for (int i=1;i<idNumber.length;i++){
            int current=idNumber[i];
            int j=1;
            while (j>0&&idNumber[j-1]>current){
                idNumber[j]=idNumber[j-1];
                j--;
            }
            idNumber[j]=current;
        }
    }
}
