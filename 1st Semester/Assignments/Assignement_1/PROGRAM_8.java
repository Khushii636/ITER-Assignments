/*Write a Java program to exchange the values of two variables of integer type X and Y  without using third temporary variable 
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_8 {

	public static void main(String[] args) 
	{
		int X,Y;
		X=10;
		Y=20;
		System.out.println("BEFORE SWAPING: X="+X+" AND Y="+Y);
		X=X+Y;
		Y=X-Y;
		X=X-Y;
		System.out.println("AFTER SWAPING: X="+X+" AND Y="+Y);

	}

}
