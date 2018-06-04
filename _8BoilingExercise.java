package udemy;

import java.util.Scanner;

public class _8BoilingExercise 
{
	public static void main(String args[])
	{
		System.out.println("Give the Temperature:");
		Scanner scan = new Scanner(System.in);
		
		int temp = scan.nextInt();
		
		if(temp >= 100)
			System.out.println("The water is boiling.");
		else
			System.out.println("The water is not boiling.");
		
		scan.close();
	}
}
