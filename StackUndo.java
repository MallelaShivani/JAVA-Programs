package xyz;

import java.util.Stack;

public class StackUndo {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("Write");
		s.push("Delete");
		s.push("Insert");
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		s.pop();
		System.out.println(s);
		

	}

}
