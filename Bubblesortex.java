package xyz;

public class Bubblesortex {
    public static void main(String[] args) {
        String[] names = {"Zara", "Alex", "Ravi", "Meena", "John"};

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
