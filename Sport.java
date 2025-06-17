package xyz;

import java.util.HashSet;
import java.util.Iterator;

public class Sport {
	public static void main(String[] args) {
		HashSet<String> sportnames = new HashSet<String>();
		sportnames.add("cricket");
		sportnames.add("Hockey");
		sportnames.add("cricket");
		sportnames.add("Hockey");
		sportnames.add("football");
		sportnames.add("volleyball");
		sportnames.add("basketball");
		sportnames.add("boxing");
		sportnames.add("swimming");
		sportnames.add("karate");
		Iterator<String> it=sportnames.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);}
		
	}
}
