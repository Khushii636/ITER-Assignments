/*Write a java program that takes two positive integers from command-line arguments and prints the result of first number raise to 
 * the power of second number
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_2 {

	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		int pow=(int)Math.pow(a,b);
		System.out.println(a+" to the power "+b+" is "+pow);
		
	}

}
