/*Write a java program to take three inputs from command line argument as principle, rate and time. Find Simple interest.
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_1 {

	public static void main(String[] args) 
	{
		double p,r,t;
		p=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		t=Double.parseDouble(args[2]);
		double SI=(p*r*t)/100;
		System.out.println("Simple Interest= "+SI);
	}
}
