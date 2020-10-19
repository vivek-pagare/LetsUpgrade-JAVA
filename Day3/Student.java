package Day3;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int markArray[] = new int[5];
        int i;
        float sum=0;
        float percentage;
        
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks for 5 Subjects : ");
        
		for(i=0; i<5; i++){
            markArray[i] = sc.nextInt();
            sum = sum + markArray[i];
        }
        
		percentage = (sum/500) * 100;
	      
		if(percentage < 50)
	      {
	    	  System.out.println("Grade :: 'B'");
	    	  System.out.println("Percentage ::"+ percentage); 
	      }else if(percentage < 60)
	      {
	    	  System.out.println("Grade :: 'B+'");
	    	  System.out.println("Percentage ::"+ percentage); 
	      }else if(percentage < 70)
	      {
	    	  System.out.println("Grade :: 'A'");
	    	  System.out.println("Percentage ::"+ percentage); 
	      }else
	      {
	    	  System.out.println("Grade :: 'Distinction'");
	    	  System.out.println("Percentage ::"+ percentage); 
	      }
	    	  
	      
	}
}
