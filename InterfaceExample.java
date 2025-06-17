
package xyz;

interface PrintTable {
	void print();
}
class messagee implements PrintTable{
	public void print() {
		System.out.println("Hello From INTERFACE ");
	}
}
public class InterfaceExample{
	public static void main(String[] args) {
		messagee msg = new messagee();
		
		msg.print();
		
	}
}