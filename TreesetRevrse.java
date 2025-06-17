package xyz;

import java.util.Collections;
import java.util.TreeSet;

public class TreesetRevrse {

	public static void main(String[] args) {
		TreeSet<String> ts =new TreeSet<String>(Collections.reverseOrder());
		ts.add("Sumit");
		ts.add("Karan");
		ts.add("Anjali");
		ts.add("Mohan");
		ts.add("Zoya");
		System.out.println(ts);
			
		}
		

	}

