package Day3;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String name;
		int age, dob, mob, by;
		double tax=0,salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.nextLine();
		
		System.out.println("Enter age");
		age = sc.nextInt();
		if(age<18||age>60)
			return;
		
		System.out.println("Enter date of birth");
		dob = sc.nextInt();
		if((dob<1)||(dob>31))
		{
			System.out.println("Enter valid date of birth");
			return;
		}
		
		System.out.println("Enter month of birth");
		mob = sc.nextInt();
		if(mob<=1||mob>=12)
		{
			System.out.println("Enter valid month of birth");
			return;
		}
		
		System.out.println("Enter Birth year");
		by = sc.nextInt();
		
		System.out.println("Enter salary ");
		salary=sc.nextDouble();
		
		if(salary<=200000)
			tax=0;
		else if(salary<=300000)
			tax=(0.05*(salary-200000));
		else if(salary<=500000)
			tax=(0.1*(salary-300000))+(0.1*100000);
		else if(salary<=1000000)
			tax=(0.15*(salary-500000))+(0.2*200000)+(0.1*100000);
		else
			tax=(0.20*(salary-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
		
		System.out.println("Name  : "+name);
		System.out.println("Age : "+age);
		System.out.println("Annual Salary : "+salary);
		System.out.println("Income tax amount is "+tax);
		}
}
