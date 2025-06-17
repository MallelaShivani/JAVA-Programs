package xyz;

public class Reversearray {
	public static void main(String [] args) {
		int [] arr= {1,3,6,7,9};
		int n=arr.length;
		for (int i=0; i<n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
	}
		System.out.println("reversed");
		for(int arrs:arr) {
			System.out.println(arrs);
			
		}
}
}
