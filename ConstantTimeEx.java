package xyz;

public class ConstantTimeEx {
	public static void printFirstElement(int[]arr) {
		if(arr.length>0) {
			System.out.println("first element is:"+arr[0]);
		}else {
			System.out.println("array is empty");
		}
	}
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		printFirstElement(numbers);

}
}