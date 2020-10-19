package Day4;

import java.util.Scanner;

public class Avenger {
	Scanner sc = new Scanner(System.in);
	
	public String name;
	public int age;
	public int power;
	public String weapon;
	public String planet;
	
	public void getDetails() {
		System.out.println("Enter name :");
		name = sc.next();
		
		System.out.println("Enter age :");
		age = sc.nextInt();
		
		System.out.println("Enter power :");
		power = sc.nextInt();
		
		System.out.println("Enter weapon :");
		weapon = sc.next();
		
		System.out.println("Enter planet :");
		planet = sc.next();
	}
	
	public void displayDetails() {
		System.out.println("Name is "+name+
						   " Age is "+age+
						   " Power is "+power+
						   " Weapon is "+weapon+
						   " Planet is "+planet);
	}

}
