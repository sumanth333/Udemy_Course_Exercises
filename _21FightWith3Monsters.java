package udemy;

import java.util.Random;
import java.util.Scanner;

public class _21FightWith3Monsters
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		//Your inputs
		System.out.println("Your attack poinsts:");
		int yourAttack = generator.nextInt(6)+5;
		System.out.println(yourAttack);
		System.out.println("Your defence poinsts:");
		int yourDefence = generator.nextInt(10)+6;
		System.out.println(yourDefence);
		System.out.println("Your Damage:");
		int yourDamage = generator.nextInt(3)+2;
		System.out.println(yourDamage);
		System.out.println("Your life poinsts:	");
		int yourLife = generator.nextInt(20)+25;
		System.out.println(yourLife);
				
				
		
		for(int i=0;i<3;++i)
		{
			String monsterName="";
			int name = generator.nextInt(5);
			switch(name)
			{
				case 0: monsterName = "Black Daemon";break;
				case 1: monsterName = "The Rabbit";break;
				case 2: monsterName = "Silver Dragon";break;
				case 3: monsterName = "Mountain Troll";break;
				case 4: monsterName = "N/A";break;
			}
			//Monster inputs
			System.out.println("Attack points of "+monsterName+":");
			int monsterAttack = generator.nextInt(8)+1;
			System.out.println(monsterAttack);
			System.out.println("Defence points of "+monsterName+":");
			int monsterDefence = generator.nextInt(10)+1;
			System.out.println(monsterDefence);
			System.out.println("Damage of "+monsterName+":");
			int monsterDamage = generator.nextInt(3)+1;
			System.out.println(monsterDamage);
			System.out.println("Life points of "+monsterName+":");
			int monsterLife = generator.nextInt(20)+1;
			System.out.println(monsterLife);
		
			
			boolean runaway = false;
			
			do
			{
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
						System.out.println(monsterName+" remaining points: "+monsterLife);
					}
					else
						System.out.println("Your attack was not successfull.");
				}
				else
				{
					System.out.println(monsterName+" attack");
					int dice = generator.nextInt(6)+1+generator.nextInt(6)+1;
					int attackValue = monsterAttack+dice;
					System.out.println("Rolled values: "+dice);
					System.out.println(monsterName+" attack value: "+attackValue);
					
					if(attackValue>yourDefence)
					{
						System.out.println(monsterName+" attack was succesfull.");
						yourLife -= monsterDamage;
						System.out.println("Your remaining points: "+yourLife);
					}
					else
						System.out.println(monsterName+" attack was not successfull.");
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
			{
				System.out.println("You are dead. R.I.P :-(");
				break;
			}
			if(monsterLife <= 0)
				System.out.println("You won. The "+monsterName+" is dead.");
			
		}
		}
}
