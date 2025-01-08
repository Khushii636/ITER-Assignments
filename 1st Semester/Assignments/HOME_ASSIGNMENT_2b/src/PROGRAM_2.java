/*The surface area of a cylinder can be defined as A= πr2+2πrh, where r and h are the radius height of the cylinder respectively.
 *Write a java program to find the area where r and h are inputted from command line argument. Hint: Use Math.PI.
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_2 {

	public static void main(String[] args) 
	{
		double r,h;
		r=Double.parseDouble(args[0]);
		h=Double.parseDouble(args[1]);
		double Area=(Math.PI*r*r)+(2*Math.PI*r*h);
		System.out.println("Area of the given cylinder = "+Area);
	}
}