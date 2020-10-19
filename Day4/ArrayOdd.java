package Day4;

import java.util.Scanner;

public class ArrayOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Values: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println("Odd value are "+arr[i]);
			}
		}
	}

}
