/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your method can't use the multiplication, modulus, 
 *or division operators, The method signature is as follows.
        public static boolean isOdd(int n)
          Sample Run:
            Enter a number 37
            37 is odd: true
 */
import java.util.*;
public class Q6a {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=in.nextInt();
		if(isOdd(n))
		System.out.println(n+" is an odd number");
		else
			System.out.println(n+" is an even number");
	}
	public static boolean isOdd(int i)
	{
		if((i&1) == 1)
			return true;
		else 
			return false;
	}
}