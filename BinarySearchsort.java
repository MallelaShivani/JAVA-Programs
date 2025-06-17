package xyz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchsort {

	public static void main(String[] args) {
		String [] names= {"Amit","Divya","Karan","Priya","Zoya"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String search=sc.nextLine();
		int index=Arrays.binarySearch(names,search);
		if(index>=0) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		sc.close();
	}

}
