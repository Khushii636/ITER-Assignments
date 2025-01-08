/*Write a java program to find the difference between the sum of the squares of the first ten natural numbers and the square of the sum.
     
     The sum of the squares of the first ten natural numbers is: 12 + 22 + 32 + 42 + 52 + 62 + 72 + 82 + 92 + 102 = 385
     The square of the sum of the first ten natural numbers is:(1 + 2 + ... + 10)2 = 552 = 3025
     Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 =2640.

 * Author: Khushi Choudhary
 * Branch: CSE
 */

public class PROGRAM_1 {

	public static void main(String[] args) {
		int s=0,sq=0,d;
		for(int i=1;i<=10;i++)
			{
			s+=i*i;
			sq+=i;
			}
		System.out.println("The sum of the squares of the first ten natural numbers is: "+s);
		System.out.println("The square of the sum of the first ten natural numbers is: "+(sq*sq));
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+((sq*sq)-s));
	}
}
		
		
		
		
		