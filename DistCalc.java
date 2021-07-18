
/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #2
*/


import java.util.Scanner;
public class DistCalc {
 public static void main(String[] args) {
 float x1,x2,y1,y2;
 float distance = 0;
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter x1 and x2 coordinates :");

 x1= sc.nextFloat();
 x2 = sc.nextFloat();
 
 System.out.println("Enter y1 and y2 coordinates :");
 y1 = sc.nextFloat();
 y2 = sc.nextFloat();

 distance = (float)Math.sqrt(Math.pow(x2 -x1,  2) + Math.pow(y2 - y1,  2));
 
 System.out.println("Distance = " + distance);
 }
}
