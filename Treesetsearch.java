package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class Treesetsearch {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Keyboard");
		ts.add("Mouse");
		ts.add("Moniter");
		ts.add("CPU");
		ts.add("Webcam");
		System.out.println(ts);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a element");
		String search=sc.nextLine();
		
		if(ts.contains(search)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		sc.close();
		
		
	}

}
