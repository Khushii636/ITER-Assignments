/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if the number and its reverse both are prime then 
 * it is called twisted prime.
           Sample run 1:
              Enter a number: 97
              97 is twisted prime.
           Sample run 2: 43
              43 is not a twisted prime
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,c=0;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		for(int i=2;i*i<=n;i++)
		{
			if(n%i!=0)
			{
				c=1;
				break;
			}
		}
		if(c==1)
			System.out.println(n+" is not a twisted prime")
			els
			
