package xyz;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	public static void main(String []args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("cricket");
		names.add("Hockey");
		names.add("football");
		names.add("volleyball");
		names.add("basketball");
		names.add("boxing");
		names.add("swimming");
		names.add("karate");
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		Collections.sort(names);
		Collections.reverse(names);
		if(names.contains("Hockey")) {
			System.out.println("exits");
		}else {
			System.out.println("not exists");
		}
		
	}
	

}

