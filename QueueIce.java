package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIce {
	public static void main(String[] args) {
		Queue<String> qu=new LinkedList<String>();
		qu.add("A");
		qu.add("B");
		qu.add("C");
		qu.add("D");
		qu.add("E");
		System.out.println(qu);
		System.out.println(qu.peek());
		qu.poll();
		System.out.println(qu);
		qu.add("F");
		System.out.println(qu);
		
	}

}
