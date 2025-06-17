package xyz;

public class LinearTimeEx {
	public static void PrintAllElements(int []arr) {
		for(int i=0;i<arr.length ;i++) {
			System.out.println("Element"+i+":"+arr[i]);
		}
	}
	public static void main(String[] args) {
		int [] numbers= {10,20,30,40,50};
		PrintAllElements(numbers);
			
		}
	}

