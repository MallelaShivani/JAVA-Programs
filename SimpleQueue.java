package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
	public static void main(String [] args) {
		Queue<String> students=new LinkedList<String>();
		students.add("Student1");
		students.add("Student2");
		students.add("Student3");
		System.out.println(students);
		//students.remove();
		String firstOut=students.poll();
		System.out.println(firstOut);
		System.out.println(students);
		
		
		
		
	}

}
