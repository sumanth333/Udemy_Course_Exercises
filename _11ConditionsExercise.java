package udemy;

import java.util.Scanner;

public class _11ConditionsExercise {

	public static void main(String[] args) 
	{
		System.out.println("Give the Temperature:");
		Scanner scan = new Scanner(System.in);
		
		int temp = scan.nextInt();
		
		if(temp >= 100)
			System.out.println("The water is boiling.");
		if(temp<=0)
			System.out.println("The water is freezing.");
		if(temp >0 && temp<100)
			System.out.println("The water is in normal state.");
		
		scan.close();

	}

}
