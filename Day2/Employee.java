package Day2;

public class Employee {
	
	String name = "abcd";
	int age = 20;
	String city = "pune";
	
	void display() {
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display();
		
		Employee e1 = new Employee();
		e1.display();

	}

}
