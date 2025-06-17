package xyz;
class animal {
	void sound() {
		System.out.println("animal sounds");
	}
}
class dog extends animal{
	void sound() {
		System.out.println("dog barks");
	}	
}
class cat extends animal {
	void sound() {
		System.out.println("cat meows");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		animal a=new animal();
		animal a1=new dog();
		animal a2=new cat();
		a.sound();
		a1.sound();
		a2.sound();
		

	}

}
