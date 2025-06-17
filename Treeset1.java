package xyz;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(5002);
		ts.add(4998);
		ts.add(5005);
		ts.add(4999);
		ts.add(5001);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(4999));
		System.out.println(ts.lower(5005));
	}

}
