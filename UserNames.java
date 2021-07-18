
/*Bhavya kella
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #3
*/


import java.util.Random;
import java.util.Scanner;
public class UserNames {
 public static void main(String[] args) {
 
 String First_Name,Last_Name,Name;  
 int val;
 
 Scanner obj = new Scanner(System.in);   
 
 System.out.println("Please enter your First Name: ");  
 First_Name = obj.next();  
 
 System.out.println("Please enter your Last Name: ");   
 Last_Name = obj.next();    
 
 Random random = new Random();
 val = random.nextInt(89) + 10;
 
 Name = First_Name.substring(0,1) + Last_Name.substring(0,4) + val; 
 
 System.out.println("username : "+ Name); 
 }  
 }
