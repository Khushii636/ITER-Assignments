/*Write a java program that gets three integer numbers from the user. Count from the first number to the second number increments by 
 * the third number. Use for loop to do it. Also, display the sum of numbers displayed between the first number and second number.
           Sample run:
                 Enter first number: 4
                 Enter second number: 13
                 Enter third number: 3
                 4 7 10 13
                 The sum of number displayed is 34
 */
package Assignment_4;
import java.util.Scanner;
public class Program_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2,n3,s=0;
		System.out.print("Enter first number: ");
		n1=in.nextInt();
		System.out.print("Enter second number: ");
		n2=in.nextInt();
		System.out.print("Enter third number: ");
		n3=in.nextInt();
		for(int i=n1;i<=n2;i+=n3)
			{System.out.print(i+" ");
			s+=i;}
		System.out.println("\nThe sum of number displayed is "+s);
	    in.close();
    }
}

