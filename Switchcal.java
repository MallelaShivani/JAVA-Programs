package xyz;

import java.util.Scanner;

public class Switchcal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b=2;
		double result=0;
		System.out.println("Enter an operator:");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '+':
			result=a+b;
			System.out.println(result);
			break;
		case '-':
			result=a-b;
			System.out.println(result);
			break;
		case '*':
			result=a*b;
			System.out.println(result);
			break;
		case '/':
			result=a/b;
			System.out.println(result);
			break;
		default:
			System.out.println("invalid operator");
			sc.close();
		}
		

	}

}
