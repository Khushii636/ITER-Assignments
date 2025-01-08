/*Write a java program that reads an integer between 0 and 1000 and adds all the digits in the 
*integer. For example, if an integer is 749, the sum of all its digits is 20. 
*Hint: Use the % operator to extract digits, and use the / 
*operator to remove the extracted digit. 
*For instance, 749 % 10 = 9 and 749 / 10 = 74. 
*  Here is a sample run: 
*     Enter a number between 0 and 1000: 999 
*     The sum of the digits is 27
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_4 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n,r,c,sum;
		System.out.print("Enter a number between 0 and 1000:");
		n=in.nextInt();
		r=n%10;
		n=n/10;
		c=n%10;
		n=n/10;
		sum=n+r+c;
		System.out.println("Sum of the digits is = "+sum);
		
	}

}
