package xyz;

public class BubbleSortString {

	public static void main(String[] args) {
		String [] names= {"Orange","Watermelon","Mango","Apple","Papaya"};
		for(int i=0;i<names.length-1;i++) {
			for(int j=0;j<names.length-1;j++) {
				if (names[j].compareTo(names[j + 1]) > 0){
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
				}
			}
		}
		System.out.println("sortedList:");
		for(String num:names) {
			System.out.print(" "+num);
	}
}
}
