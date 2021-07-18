
/*Bhavya kella
 Programming fundamentals
 Summer
 Programming Assignment lab 2

*/


// Exercise #5


public class FloatEqu {
	
 public static void main(String[] args) {
	 
 double value1= (1.0/10) * (1.0/10);
 double value2 = (1.0/100);
 if (value1 == value2) 
 {
   System.out.println("EQUAL");
 }
 else
 {
   System.out.println("NOT EQUAL");
 }
 
 double tolerance =  0.2;
 if(Math.abs(value1 - value2) < tolerance)
 {
	 System.out.println("Nearly close");
 }
 
 }
}
