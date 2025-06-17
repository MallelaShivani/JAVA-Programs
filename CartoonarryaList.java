package xyz;

import java.util.ArrayList;

public class CartoonarryaList {
	public static void main(String [] args) {
		ArrayList<String> cc=new ArrayList<String>();
		cc.add("Tom");
		cc.add("Jerry");
		cc.add("PinkPanter");
		cc.add("Doremon");
		cc.add("Shinchan");
		cc.add("Nobitha");
		System.out.println(cc);
		cc.remove(2);
		System.out.println(cc);
		cc.set(cc.indexOf("Shinchan"), "Shinchan nohara");
		System.out.println(cc);
	}

}
