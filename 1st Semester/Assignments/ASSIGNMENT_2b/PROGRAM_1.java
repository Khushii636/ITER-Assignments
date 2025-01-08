/*Write a java program that takes two int values from the command line as dividend and divisor and print the quotient and remainder
 * Author: Khushi Choudhary
 * Branch: CSE
 */
public class PROGRAM_1 {

	public static void main(String[] args) 
	{
		int divident,divisor;
		divident=Integer.parseInt(args[0]);
		divisor=Integer.parseInt(args[1]);
		
        int quotient=divident / divisor;
        int remainder=divident % divisor;
		
        System.out.println("quotient is "+quotient);
		System.out.println("remainder is "+remainder);
     }
}
