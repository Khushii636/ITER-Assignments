/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if the number and its reverse both are prime then it is called twisted prime.
           Sample run 1:
              Enter a number: 97
              97 is twisted prime.
           Sample run 2: 43
              43 is not a twisted prime
 */
package Assignment_5;
import java.util.*;
public class Program_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,c=0,rev=0;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		int a=n;
		while (a!=0)
		{
			rev=(rev*10)+a%10;
			a=a/10;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0 || rev%i==0)
			{
				c=1;
				break;
			}
			
		}
		if(c==1)
			System.out.println(n+" is not a twisted prime");
			else
				System.out.println(n+" is a twisted prime");
        in.close();
    }
}
	
