/*Write a Java program that can take a positive integer greater than 2 as input and write out the number of times one must repeatedly divide this 
 * number by 2 before getting a value less than 2.
  Sample Run:
             The positive integer greater than 2 from command line argument is 67.
             The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is 5.
 */
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,count=0;
		System.out.print("The positive integer greater than 2 from command line argument is ");
		a=in.nextInt();
		do
			{
			a/=2;
			count++;
			}
		while(a>=2);
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);	
}
}		
		