/*Write a Java program to exchange the values of two variables of integer type X and Y using third temporary variable Z
 * Author: Khushi Choudhary
 * Branch: CSE
 */
public class PROGRAM_7 {

	public static void main(String[] args) 
	{
		int X,Y,Z;
		X=10;
		Y=20;
		System.out.println("BEFORE SWAPING: X="+X+" AND Y="+Y);
		Z=X;
		X=Y;
		Y=Z;
		System.out.println("AFTER SWAPING: X="+X+" AND Y="+Y);

	}

}
