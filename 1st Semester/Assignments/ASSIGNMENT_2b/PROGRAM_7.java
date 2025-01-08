/*Write a java program that takes three positive integers from command-line arguments and prints true if any one of them is less than
 *or equal to the product of the other two and false otherwise
 * Author: Khushi Choudhary
 * Branch: CSE
 */
public class PROGRAM_7 {

	public static void main(String[] args) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if(a<=(b*c)||b<=(a*c)||c<=(a*b))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}