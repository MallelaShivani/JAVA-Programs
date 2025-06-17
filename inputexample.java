package xyz;

import java.util.Scanner;

public class inputexample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the age: ");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.println("enter the Name ");
		String name =sc.nextLine();
		System.out.println(name + age);
		sc.close();
		}

}
