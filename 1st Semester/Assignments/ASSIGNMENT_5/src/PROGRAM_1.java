/*Amicable numbers are pair of numbers each of whose divisors are added to give the other number. 
    Example: The smallest pair of amicable numbers is (220, 284). 
             They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 
             284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which the sum is 220. 
       Note: 1 is included as a divisor but the numbers are not included as their own divisors. 

Write a java program that tests whether a given pair of numbers is amicable numbers or not.
        Sample run 1:
             Enter first number: 220
             Enter second number: 284
             220 and 284 are amicable numbers.
        Sample run 2:
             Enter first number: 220
             Enter second number: 230
             220 and 230 are not amicable numbers.
             
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,s=1,s1=1;
		System.out.print("Enter first number: ");
		a=in.nextInt();
		System.out.print("Enter second number: ");
		b=in.nextInt();
		for(int i=2;i*i<=a;i++)
		{
			if(a%i==0)
				s+=i+(a/i);
		}
		if(s==b)
		{
			for(int i=2;i*i<=b;i++)
			{
				if(b%i==0)
					s1+=i+(b/i);	
				}
		if(s1==a)
			System.out.println(a+" and "+b+" are amicable numbers");
		else
			System.out.println(a+" and "+b+" are not amicable numbers");
		}
		else
			System.out.println(a+" and "+b+" are not amicable numbers");
	}
}
			
		