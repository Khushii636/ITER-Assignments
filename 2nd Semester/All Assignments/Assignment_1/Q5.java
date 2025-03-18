/*Write a java method to calculate the sum of digits of a given number until the number is a single digit. The method signature is as follows.
    public static int sum_Of_Digits(int n)
      Example:
         Let n = 9294
         Sum = 9 + 2 + 9 + 4 = 24
         Sum = 2 + 4 = 6
     Sample Run:
      Enter a number 9294
      Sum of digits of 9294 until the number is a single digit is 6

             
 * Author: Khushi Choudhary
 * Regd No: 24E103A30
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=in.nextInt();
		System.out.println(sum_Of_Digits(n));
}
	public static int sum_Of_Digits(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				sum+=n%10;
				n/=10;
			}
			n=sum;
		}
		return n;
	}
}