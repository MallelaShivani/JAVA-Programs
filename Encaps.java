package xyz;

public class Encaps {
	private String name;
	private int rollno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String checkresult() {
		
		if(marks>=40) {
			return "Pass";
		}else {
			return "fail";
		}
		
	}
	public void displaydetails() {
		System.out.println("name"+getName());
		System.out.println("rollno"+getRollno());
		System.out.println("marks"+ getMarks());
		System.out.println("checkresults"+checkresult());
	}
	public static void main(String[] args) {
		Encaps s1=new Encaps();
		s1.setName("rohith");
		s1.setRollno(45);
		s1.setMarks(100);
		s1.displaydetails();
	

	}
	

}
