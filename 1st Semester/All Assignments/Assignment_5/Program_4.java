/*WAP to calculate and display the factorial of all numbers between m and n (where m < n, m > 0, n > 0)
 * Sample run:
        Enter the value of m: 2
        Enter the value of n: 5
        Factorial of 2 is: 2
        Factorial of 3 is: 6
        Factorial of 4 is: 24
        Factorial of 5 is: 120
 */
package Assignment_5;
import java.util.*;
public class Program_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m,n,c=1;
		System.out.print("Enter the value of m: ");
		m=in.nextInt();
		System.out.print("Enter the value of n: ");
		n=in.nextInt();
		for(int i=m;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				c*=j;
			}
			System.out.println("Factorial of "+i+" is: "+c);
			c=1;
		}
		
        in.close();
    }
}
