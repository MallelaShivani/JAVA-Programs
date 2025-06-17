package xyz;

import xyz.message;

interface message{
	void say();
}

public class Lambdaclass {

	public static void main(String[] args) {
		message hellomessage = () -> System.out.println("This is Lambda Message");
		hellomessage.say();
	}

}