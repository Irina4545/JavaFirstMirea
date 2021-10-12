package ru.mirea.task12.opt2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA {

    public static void main(String[] params) {
        ArrayList<SortingStudentsByGPA.Student> studentList = new ArrayList<>();

        studentList.add(new SortingStudentsByGPA.Student("Иванов", 4));
        studentList.add(new SortingStudentsByGPA.Student("Сидоров", 3));
        studentList.add(new SortingStudentsByGPA.Student("Смирнов", 5));

        Collections.sort(studentList, new Comparator<SortingStudentsByGPA.Student>() {
            @Override
            public int compare(SortingStudentsByGPA.Student o1, SortingStudentsByGPA.Student o2) {
                return o2.mark - o1.mark;
            }
        });
        for (SortingStudentsByGPA.Student student:studentList){
            System.out.println(student);
        }
    }

        static class Student {
        String name;
        int mark;

        public Student (String name, int mark) {
            this.name=name;
            this.mark=mark;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", mark=" + mark +
                    '}';
        }
    }
}
