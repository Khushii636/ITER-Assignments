/*Write a java program that takes an integer N from user, uses Math. Random () to print N random integer numbers between 1 to N, and 
 * then prints their average value. Use do while loop.
       Sample run:
         Enter a number: 6
         Random numbers generated are: 6 4 5 2 2 5
         Average of 6 random numbers are 4
 */
package Assignment_4;
import java.util.Scanner;
public class Program_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N,a=0,s=0,i=0;
		System.out.print("Enter a number: ");
		N=in.nextInt();
		System.out.print("Random numbers generated are: ");
		do
			{
			a=1+(int)((6)*Math.random());
			System.out.print(a+" ");
			s+=a;
			i++;
			}
		while(i!=N);
	   System.out.println("\nAverage of "+N+" random numbers are "+s/N);
       in.close();
    }
}
			
			
		

