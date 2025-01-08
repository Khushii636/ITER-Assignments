/*Write a java program that takes a double value t from the command line and prints the value of 
 * cos(5t) + sin(7t).use Math.cos() and Math.sin()
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_4 {

	public static void main(String[] args) 
	{
		double t,s;
		t=Double.parseDouble(args[0]);
		s=Math.cos(5*t) + Math.sin(7*t);
		System.out.println("the value of cos(5t) + sin(7t) is "+s);
		
	}

}