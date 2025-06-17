package xyz;

import java.util.HashSet;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		HashSet<String> students = new HashSet<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter names of 5 students:");
		while (students.size() <5) {
			System.out.print("Enter name of student: ");
			String name= sc.nextLine();
		if (!students.add(name)) {
			System.out.println("Name already added! Please enter a different name.");
		}
	}
		System.out.println("\nUnique student names are:");
		for (String student: students) {
			System.out.println(student);
		}
		sc.close();
}
}


