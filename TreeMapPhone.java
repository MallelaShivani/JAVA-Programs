package xyz;


import java.util.TreeMap;
 public class TreeMapPhone {
	 

public static void main(String[] args, TreeMap<Integer, String> Phonebook) { 
	TreeMap<Integer, String> stulist=new TreeMap<Integer, String>();
	stulist.put(59,"ram"); 

stulist.put(67, "latha");

stulist.put(98, "ravi"); 

stulist.put(70,"raju"); 

System.out.println(stulist);

String searchValue = "ram"; 

if (stulist.containsValue(searchValue)) {

System.out.println("found in TreeMap.");
} else {
	System.out.println("not found.");

}
TreeMap<String, Integer> Phonebook1=new TreeMap<String, Integer>();

Phonebook1.put("sarayu", 98778643);

Phonebook1.put("ravi", 984512349);

Phonebook1.put("anita", 9912345);

Phonebook1.put("sam", 98778481);

Phonebook1.put("devansh", 99123456);

System.out.println(Phonebook1);
}
}
 