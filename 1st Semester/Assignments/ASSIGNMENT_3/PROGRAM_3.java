/*Write a program that reads three integers from the user and prints "Increasing" if the numbers are in increasing order, "Decreasing" 
 * if the numbers are in decreasing order, and "Neither increasing nor decreasing order" otherwise. 
     Here is sample run: 
             Input first number: 241 
             Input second number:345 
             Input third number: 4563 
             “Increasing”
             
             Input first number: 345
             Input second number:145
             Input third number: 563 
             “Neither Increasing nor decreasing”
             
             Input first number: 45
             Input second number:14
             Input third number: 3 
             “Decreasing”

 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.print("Input first number:");
		a=in.nextInt();
		System.out.print("Input second number:");
		b=in.nextInt();
		System.out.print("Input third number:");
		c=in.nextInt();
		if (a<=b && b<=c && a!=c )
		{
			System.out.println("\"Increasing\"");
		}
		else if (a>=b&& b>=c&& a!=c )
		{
			System.out.println("\"Decreasing\"");
		}	
		else
			{
				System.out.println("\"Neither increasing nor decreasing order\"");
			}
			

	}

}
