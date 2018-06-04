package udemy;

import java.util.Scanner;

public class _14DiceExercise 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int die;
		do
		{
			System.out.println("Please give the value of die: ");
			die = scan.nextInt();
			if(die<1 || die>6)
				System.out.println("The value of die is bad.");
			
		}while(die<1 || die>6);
	}
}
