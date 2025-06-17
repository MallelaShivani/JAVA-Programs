package xyz;

import java.util.ArrayList;

class Students {
    String name;
    int age;
    int grade;

    Students(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class ArrayOOPS {
    public static void main(String[] args) {
        ArrayList<Students> studentss = new ArrayList<>();

        studentss.add(new Students("Ravi", 20, 85));
        studentss.add(new Students("Sneha", 19, 78));
        studentss.add(new Students("Arjun", 21, 92));
        studentss.add(new Students("Meena", 20, 88));
        studentss.add(new Students("Rahul", 22, 75));

        System.out.println("Students with grade above 80:");
        for (Students s : studentss) {
            if (s.grade > 80) {
                System.out.println(s.name);
            }
        }
    }
}
