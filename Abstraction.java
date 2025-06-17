package xyz;
abstract class Cars {
    abstract void start();
    abstract void drive();
    abstract void halt();
}
public class Abstraction {

    void start() {
        System.out.println("Car started using key or push button.");
    }

    void drive() {
        System.out.println("Driving using steering:");
        
    }
    void halt() {
        System.out.println("Car stopped.");
    }


    public static void main(String[] args) {
        Abstraction myCar = new Abstraction();
        myCar.start();
        myCar.drive();
        myCar.halt();
    }
}
