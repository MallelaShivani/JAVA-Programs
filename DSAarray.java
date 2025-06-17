package xyz;

import java.util.Scanner;

public class DSAarray {
	public static void main(String [] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int[] nums = new int[5];

		        System.out.println("Enter 5 numbers:");
		        for (int i = 0; i < 5; i++) {
		            nums[i] = sc.nextInt();
		        }

		        int max = nums[0];
		        for (int i = 1; i < 5; i++) {
		            if (nums[i] > max) {
		                max = nums[i];
		            }
		        }

		        System.out.println("Maximum number is: " + max);
		        sc.close();
		    }
}

	


