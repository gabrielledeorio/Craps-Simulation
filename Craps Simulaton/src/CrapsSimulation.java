import java.util.Scanner;

public class CrapsSimulation
	{

		static int point;
		public static void main(String[] args)
		{
			
			Scanner userIntInput = new Scanner (System.in);
			Scanner userStringInput = new Scanner (System.in);
			System.out.println("Good day! What is your name?");
			String name =userStringInput.nextLine();
			System.out.println("Hello "+ name + " Good Luck!");

			
			
			
			int dieRoll1= (int) (Math.random()*6 + 1);
			int dieRoll2= (int) (Math.random()*6+ 1);
			
			int totalDice= dieRoll1 + dieRoll2;
			System.out.println("You rolled for a "+dieRoll1+" and a "+dieRoll2+" for a total of "+ totalDice);
			
			boolean playing = true;
			
				
		
// lose first round
					if (totalDice == 12|| totalDice == 2)
						{
							playing = false ;
							System.out.println("You lose! Try again next time! ");
						}
//winning first round 
					if (totalDice == 7 || totalDice== 11 )
						{ 
							playing= false; 
							System.out.println(" Congrats! You won!");
						}
					else 
						{
							
							System.out.println(" Your current point is " + totalDice + ".");
							point= totalDice;
						}
					
				while (playing)
					{
						int dieRoll3= (int) (Math.random()*6 + 1);
						int dieRoll4= (int) (Math.random()*6+ 1);
						int totalDice2= dieRoll3 + dieRoll4;
						System.out.println("Roll again!");
						String guessTwo =userStringInput.nextLine();
						System.out.println("You now rolled a "+ dieRoll3 + " and a "+ dieRoll4 + " for a total of " + totalDice2);
						
					
							
								if ( totalDice2==totalDice)
									{
										System.out.println("You won!");
										playing= false; 
									}
								else if (totalDice2==7)
									{
										
										System.out.println("YOU LOSE!");
									}
							
					}
					
				
				
		}
	}



			