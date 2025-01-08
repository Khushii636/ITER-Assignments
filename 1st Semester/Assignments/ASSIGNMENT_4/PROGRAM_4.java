/*Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's algorithm, which is an iterative computation 
 * based on the following observation: if y divides x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y 
 * and y.
          Sample run:
             Enter the first number: 56
             Enter the second number: 98
             GCD of 56 and 98 is 14.
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2,r=0;
		System.out.print("Enter first number: ");
		n1=in.nextInt();
		System.out.print("Enter second number: ");
		n2=in.nextInt();
		System.out.print("GCD of "+n1+" and "+n2+" is ");
		do {
			r=n1%n2;
			n1=n2;
			n2=r;
		}
		while(r!=0);
		System.out.print(n1);
	}
}
		