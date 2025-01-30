/*WAP to enter the first number and second number. Display the prime numbers between the first and second number.
 * Sample run:
       Enter the first number: 4
       Enter the second number: 15
       Prime numbers between 4 and 15 are: 5 7 11 13
 */
package Assignment_5;
import java.util.*;
public class Program_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2,c=0;
		System.out.print("Enter the first number: ");
		n1=in.nextInt();
		System.out.print("Enter the second number: ");
		n2=in.nextInt();
		System.out.print("Prime numbers between "+n1+" and "+n2+" are: ");
		for(int i=n1;i<=n2;i++)
		{
			for(int j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					c=1;
					break;
				}
			}
			if(c==0)
				System.out.print(i+" ");
			else
				c=0;
				
			
		}
		
	    in.close();
    }
}