/*Write a Java program to check if a number is perfect number or not. 
   (Hints: A number N is called perfect number, if the sum of factors except N as a factor is equals to the number N. 
     Example:
      N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)
        Sample run1:
          Enter a number: 496
          496 is a perfect number.
        Sample run2:
          Enter a number: 490
          490 is not a perfect number
 */
package Assignment_4;
import java.util.Scanner;
public class Program_5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,s=1;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
			{
				s+=i;
				s+=(n/i);
			}
		if(s==n)
			System.out.println(n+" is a perfect number.");
		else
			System.out.println(n+" is not a perfect number.");
            in.close();
        }
    }


