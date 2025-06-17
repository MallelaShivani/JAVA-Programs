package xyz;

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		String [] names= {"Mamatha","Jhanu","Maggi","Shivani","Likki","Gayee"};
		Arrays.sort(names);
		System.out.println("Sorted names:");
		for(String name:names) {
			System.out.println(name);
		}

	}

}
