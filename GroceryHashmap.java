package xyz;

import java.util.HashMap;

public class GroceryHashmap{
	public static void main (String[] args) {
		HashMap<String,Integer> hm= new HashMap<String, Integer>();
		hm.put("Apple", 150);
		hm.put("Rice", 90);
		hm.put("Paste", 40);
		hm.put("Redgram", 70);
		hm.put("Brush", 20);
		System.out.println(hm);
		int totalCost=0;
		for (int cost : hm.values()) {
            totalCost += cost;
            System.out.println(totalCost);
	}
		hm.put("Paste",30);
		System.out.println(hm);
		hm.remove("Brush");
		System.out.println(hm);
}
}