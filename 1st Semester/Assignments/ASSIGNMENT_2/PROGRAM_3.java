/*Enter the basic salary of an employee of an organization through the keyboard. His dearness 
*allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic 
*salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross 
*salary.
*  Here is the sample run:
*     Enter basic salary: 15600
*     DA is 6240.0
*     HRA is 3120.0
*     Gross salary is 24960
 * 
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_3 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double BS,DA,HRA;
		int GS;
		System.out.print("Enter Basic Salary:");
		BS=in.nextDouble();
		DA=0.4*BS;
		HRA=0.2*BS;
		GS=(int)(BS+DA+HRA);
		System.out.println("Dearness Allownace is "+DA);
		System.out.println("House Rent Allowance is "+HRA);
		System.out.println("Gross Salary is "+GS);
	}

}
