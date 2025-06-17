package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class IcecreamQueue {

	public static void main(String[] args) {
		Queue<String> kids=new LinkedList<String>();
		kids.add("maagi");
		kids.add("teju");
		kids.add("mummy");
		kids.add("carrie");
		kids.add("jaan");
		System.out.println(kids);
		while(!kids.isEmpty()) {
			String kid=kids.poll();
			System.out.println(kid+" got icecream");
		}
		

	}

}
