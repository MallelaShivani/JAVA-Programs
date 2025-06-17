package xyz;

import java.util.TreeMap;

public class TreeMapcapital {

	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("India", "NewDelhi");
		tm.put("USA", "WashingTon");
		tm.put("Germany", "Berlin");
		tm.put("Japan", "Tokyo");
		tm.put("India", "Delhi");
		System.out.println(tm); 

	}

}
