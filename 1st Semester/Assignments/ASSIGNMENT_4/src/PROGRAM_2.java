/*An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your program to determine whether or 
 * not the number is divisible by 9. Test it on the following numbers: Use while loop.
      n = 123456
      n = 154368
      n = 621594
    Hint: Use the % operator to get each digit; then use / operator to remove the digit.
        Sample run 1:
         Enter a number: 154368
         The number 154368 is divisible by 9.
        Sample run 2:
         Enter a number: 123456
         The number 123456 is not divisible by 9.
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,s=0;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		System.out.print("The number "+n);
		while(n!=0)
		{
			s+=n%10;
			n/=10;
		}
		if(s%9==0)
		System.out.println(" is divisible by 9.");
		else
		System.out.println(" is not divisible by 9.");
	}
}
		