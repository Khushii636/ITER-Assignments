/*When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The 
*distance it travels is given by d = (1/2) gt2
*Here d is in feet, t is the time in seconds, and g is 32.174.
*Write a program that asks the user for the number of seconds and then prints out the distance 
*travelled.
*    Here is the sample run:
*        Enter the number of seconds: 5.4 
*        Distance travelled: 469.096

 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_6 {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double t,d;
		System.out.print("Enter the number of seconds:");
	    t=in.nextDouble();
	    d=(1.0/2)*32.174*t*t;
	    System.out.println("Distance travelled:"+d);
	}

}
