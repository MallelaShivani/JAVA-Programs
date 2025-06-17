package xyz;

public class Linearsearch {
	public static void main(String [] args) {
		int [] numbers= {1,2,5,9,4,7};
		int target=6;
		boolean found=false;
		for( int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
			System.out.println("found"+" "+target+"at index"+i);
			found = true;
			break;
		}
		}
		if(!found) {
			System.out.println("number"+target+"notfound");
		}
	}
}
