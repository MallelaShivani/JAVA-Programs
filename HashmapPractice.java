package xyz;

import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer,String>();
		studentMap.put(1,"mummy");
		studentMap.put(2,"teja");
		studentMap.put(4,"jaanu");
		studentMap.put(5, "teja");
		studentMap.put(7, "gayee");
		studentMap.remove(5);
		studentMap.put(6,"mahi");
		System.out.println(studentMap);
		if (studentMap.containsKey(7)) {
            System.out.println("Key '7' exists with value: " + studentMap.get(7));
        } else {
            System.out.println("Key '7' does not exist.");
        }
		System.out.println("\nAll key-value pairs:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}


		}

	}