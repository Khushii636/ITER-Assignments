/*Write a java program to enter two numbers through the keyboard. Write a program to find the value of one number raised to the power 
 * of another. (Do not use Java built-in method).
          Sample run:
             Enter the base: 5
             Enter the power: 4
             5 to the power 4 is: 625
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b,p,a=1;
		System.out.print("Enter the base: ");
		b=in.nextInt();
		System.out.print("Enter the power: ");
		p=in.nextInt();
		for(int i=1;i<=p;i++)
			a*=b;
		System.out.println(b+" to the power "+p+" is: "+a);
	}
}
		