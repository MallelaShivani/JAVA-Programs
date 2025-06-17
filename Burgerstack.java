package xyz;

import java.util.Stack;

public class Burgerstack {

	public static void main(String[] args) {
		Stack<String> burgerStack =new Stack<String>();
		burgerStack.push("Burger1");
		burgerStack.push("Burger2");
		burgerStack.push("Burger3");
		System.out.println("Top burger is "+burgerStack.peek());
		System.out.println("Serving" +burgerStack.pop());
		if(burgerStack.isEmpty()) {
			System.out.println("All burgers are served");
		}

	}

}
