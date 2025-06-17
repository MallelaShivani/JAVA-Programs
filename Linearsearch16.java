package xyz;

public class Linearsearch16 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 5};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}