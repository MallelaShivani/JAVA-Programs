package xyz;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        sc.close();
	}
	
	

}
