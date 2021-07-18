
/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 
*/

//Exercise #1

import java.util.Scanner; 
import java.util.Random;
public class AgeGuess {
	public static void main(String[] args) {
		
		    Scanner var = new Scanner(System.in);	
			
			int age;
			String ageGuess;
			
            Random random = new Random();
			
			age = random.nextInt(10);
			
			System.out.println("please Enter Guess :"); 
			
			ageGuess = var.nextLine();
			
			System.out.println("your Guessed number :" + ageGuess );
			
			System.out.println("The correct Guess number : " + age);
			
		}
				
	}
	
