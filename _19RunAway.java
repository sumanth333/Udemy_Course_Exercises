package udemy;

import java.util.Random;
import java.util.Scanner;

public class _19RunAway
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		//Monster inputs
		System.out.println("Attack points of Monster:");
		int monsterAttack = scan.nextInt();
		System.out.println("Defence points of Monster:");
		int monsterDefence = scan.nextInt();
		System.out.println("Damage of Monster:");
		int monsterDamage = scan.nextInt();
		System.out.println("Life points of Monster:");
		int monsterLife = scan.nextInt();
	
		//Your inputs
		System.out.println("Your attack poinsts:");
		int yourAttack = scan.nextInt();
		System.out.println("Your defence poinsts:");
		int yourDefence = scan.nextInt();
		System.out.println("Your Damage:");
		int yourDamage = scan.nextInt();
		System.out.println("Your life poinsts:	");
		int yourLife = scan.nextInt();
		scan.nextLine();
		
		boolean runaway = false;
		
		do
		{
			Random generator = new Random();
			boolean attacker = generator.nextBoolean();
			
			if(attacker)
			{
				System.out.println("You attack");
				int dice = generator.nextInt(6)+1+generator.nextInt(6)+1;
				int attackValue = yourAttack+dice;
				System.out.println("Rolled values: "+dice);
				System.out.println("Your attack value: "+attackValue);
				
				if(attackValue>monsterDefence)
				{
					System.out.println("Your attack was succesfull.");
					monsterLife -= yourDamage;
					System.out.println("Monster remaining points: "+monsterLife);
				}
				else
					System.out.println("Your attack was not successfull.");
			}
			else
			{
				System.out.println("Monster attack");
				int dice = generator.nextInt(6)+1+generator.nextInt(6)+1;
				int attackValue = monsterAttack+dice;
				System.out.println("Rolled values: "+dice);
				System.out.println("Monster attack value: "+attackValue);
				
				if(attackValue>yourDefence)
				{
					System.out.println("Monster attack was succesfull.");
					yourLife -= monsterDamage;
					System.out.println("Your remaining points: "+yourLife);
				}
				else
					System.out.println("Monster attack was not successfull.");
			}
			
			System.out.println("Press Enter to continue. (or type in 'run' to run away)");
			String command = scan.nextLine();
			
			switch(command)
			{
				case "run":
					System.out.println("You ran away. You coward! -5 Life points!");
					yourLife -= 5;
					runaway = true;
					break;
				default:
					
			}
			
		}while(yourLife >0 && monsterLife > 0 && !runaway);
		
		if(yourLife <= 0)
			System.out.println("You are dead. R.I.P :-(");
		if(monsterLife <= 0)
			System.out.println("You won. The monster is dead.");
		
	}
}
