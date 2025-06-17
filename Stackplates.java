package xyz;

import java.util.Stack;

public class Stackplates {

	public static void main(String[] args) {
		Stack<String> plates=new Stack<String>();
		plates.push("Plate1");
		plates.push("Plate2");
		plates.push("Plate3");
		plates.push("Plate4");
		plates.push("Plate5");
		System.out.println("Serving" +plates.pop());
		System.out.println(plates);
		

	}

}
