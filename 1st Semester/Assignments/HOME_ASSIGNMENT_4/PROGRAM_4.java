/*Write a java program to print the sum of all even numbers and the product of all odd numbers from 1 to N. Where, N is the input to 
 *the program.
         For input, N = 10
         Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
         Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,s=0,p=1;
		System.out.print("For input, N = ");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
			{
			if(i%2==0)
				s+=i;
			else
				p*=i;
			}
		System.out.println("Sum of all even numbers = "+s);
		System.out.println("Product of all odd numbers = "+p);
	}
}