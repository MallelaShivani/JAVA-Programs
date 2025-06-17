package xyz;

import java.util.HashSet;
import java.util.Scanner;

public class Studentlist {

	public static void main(String[] args) {
		HashSet<String> students =new HashSet<String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the names of 5 students");
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the name:");
			String name =sc.nextLine();
			students.add(name);
			}
		System.out.println("Students names are :");
		for(String student :students) {
			System.out.println(student);
		}
		sc.close();
			
		}
		

	} 
