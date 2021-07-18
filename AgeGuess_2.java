/*Bhavya kella
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #4
*/

import java.util.Scanner; 
import java.util.Random;
public class AgeGuess_2{
	
	public static void main(String[] args) {
		
		    Scanner var = new Scanner(System.in);
			Random rand = new Random();
			int age = rand.nextInt(10);
			int ageGuess;
			System.out.println("Enter your Guess :"); 
			ageGuess = var.nextInt();
			
			if ( age == ageGuess) 
			{
			    System.out.println("The Guess is Correct");
			}
			if(ageGuess != age)
			{
				System.out.println("You Guess is wrong");
				
				if(ageGuess < age )
				{
					System.out.println("Older");
				}
				else
				{
					System.out.println("younger");
				}
			}
		}
				
	}
	
