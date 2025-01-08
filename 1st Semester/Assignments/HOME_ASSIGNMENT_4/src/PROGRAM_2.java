/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.The sum of these multiples is 23. 
 * Write a java program to find the sum of all the multiples of 3 or 5 below 1000.
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_2 {

	public static void main(String[] args) {
		int s=0;
		for(int i=3;i<1000;i++)
		{
			if((i%3)==0||(i%5)==0)
				s+=i;
		}
			
		System.out.println("the sum of all the multiples of 3 or 5 below 1000 is "+s);
	}
}
		