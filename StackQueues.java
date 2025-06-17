package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueues {

	public static void main(String[] args) {
		Stack<String> Toybox =new Stack<String>();
		Toybox.push("Ball");
		Toybox.push("Blocks");
		Toybox.push("puzzle");
		String toy=Toybox.pop();
		System.out.println(toy);
		System.out.println(Toybox);
		
		Queue<String> Icecreamline=new LinkedList<String>();
		Icecreamline.add("maya");
		Icecreamline.add("leo");
		Icecreamline.add("nina");
		String firstOut=Icecreamline.poll();
		System.out.println(firstOut);
		System.out.println(Icecreamline);

	}

}
