/*Write a java program that reads the radius of a hemisphere and computes the surface area 
*and volume using the following formulas: 
*Surface Area of Hemisphere = 3 π r2
* Volume of a hemisphere = (2/3)πr3
*Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the 
*hemisphere. Hint: Use Math.PI.
*  Here is a sample run: 
*       Enter the radius of the hemisphere: 7.0 
*       The surface area of the hemisphere is 461.814 
*       The volume area of the hemisphere is 718.377
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_5 {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double r,SA,V;
		System.out.print("Enter the radius of the hemisphere:");
		r=in.nextDouble();
		SA=3*Math.PI*r*r;
		V=(2.0/3)*Math.PI*r*r*r;
		System.out.println("the Surface Area of the hemisphere is "+SA);
		System.out.println("the Volume of the hemisphere is "+V);

	}

}
