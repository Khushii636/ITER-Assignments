/*Write a java program to check whether a number is a spy number or not. 
  Example:
    N = 132
    Sum of digit of N = 1 + 3 + 2 = 6
    Product of digit of N = 1 × 3 × 2 = 6
    So, 132 is a spy number.

        Sample Run:
            Enter a number: 1124
            1124 is a spy number.
 */
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,sum=0,p=1;
		System.out.print("Enter the number: ");
		n=in.nextInt();
		int a=n;
		while(n!=0)
		{
			sum+=n%10;
			p*=n%10;
			n/=10;
		}
		if(sum==p)
			System.out.println(a+" is a spy number");
		else
			System.out.println(a+" is not a spy number");
}
}