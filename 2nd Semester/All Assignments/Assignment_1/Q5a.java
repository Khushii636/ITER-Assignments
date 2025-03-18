/*/*Write a java method to calculate the sum of digits of a given number until the number is a single digit. The method signature is as follows.
    public static int sum_Of_Digits(int n)
      Example:
         Let n = 9294
         Sum = 9 + 2 + 9 + 4 = 24
         Sum = 2 + 4 = 6
     Sample Run:
      Enter a number 9294
      Sum of digits of 9294 until the number is a single digit is 6
 */
import java.util.*;
public class Q5a {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=in.nextInt();
		System.out.println(n%9);

	}
}