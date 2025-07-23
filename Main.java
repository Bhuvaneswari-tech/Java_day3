package Oops;

public class Main {

	public static void main(String[] args) {
		//Person reference for abstraction
		
		Person stud = new Student1("Rahul",16,"10th");
		
		//Calling the abstract class normal method
		stud.greet();
		
		//Call abstract method implemented in subclass Student1
		stud.displayDetails();
		
		//stud.setGrade("11th");
		if(stud instanceof Student1) {
			Student1 stu = (Student1) stud;
			stu.setGrade("11th");
			System.out.println("\nAfter Updating grade:");
			stu.displayDetails();
		}
		

	}

}
