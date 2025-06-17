package xyz;

import java.util.LinkedList;
import java.util.Scanner;

public class StudenLinkedlists {

	public static void main(String[] args) {
		LinkedList<String> students =new LinkedList<String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Names of 5 stdents");
		for(int i=1 ;i<=5 ;i++) {
			System.out.println("enter names of students" + i + ":");
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
