
/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
*/

// Exercise #6
import java.util.Scanner;
public class NumDisplay {
 public static void main(String[] args) {
 String num = null;
 Scanner value = new Scanner(System.in);
 
 System.out.println("Please Enter a Number Between 0 & 9");
 int val = value.nextInt();


 switch (val) {
 case 0: num = "Zero";
 break;
 case 1: num = "one";
 break;
 case 2: num = "two";
 break;
 case 3: num = "three";
 break;
 case 4: num = "four";
 break;
 case 5: num= "five";
 break;
 case 6: num = "six";
 break;
 case 7: num = "seven";
 break;
 case 8: num = "eight";
 break;
 case 9: num = "nine";
 break;
 default: num = "Invalid Number";
 break;
 }
 System.out.println(num);
 }
}