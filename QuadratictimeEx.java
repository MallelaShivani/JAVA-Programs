package xyz;

public class QuadratictimeEx {
	public static void main(String[]args) {
		int [] numbers= {1, 2, 3, 4, 3, 5, 8, 2};
		boolean hasDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hasDuplicate=true;
					System.out.println("Duplicate found:"+numbers[i]);
				}
			}
		}
		if(!hasDuplicate) {
			System.out.println("no duplicate found");
		}
	}

}
