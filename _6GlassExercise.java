package udemy;

public class _6GlassExercise 
{

	public static void main(String[] args) 
	{
		int first = 7;
		int second = 19;
		
		first = first ^ second;
		second= first ^ second;
		first = first ^ second;
		
		System.out.println("first="+first+" second="+second);
		
	}

}