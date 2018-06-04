package udemy;

import java.util.Scanner;

public class _7TemperatureExercise 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give celsius value:");
		double celsius = scan.nextDouble();
		double fahrenheit = 9 / 5 * celsius +32;
		scan.close();
		
		
		System.out.println("Fahrenheit:"+fahrenheit);
	}
}
