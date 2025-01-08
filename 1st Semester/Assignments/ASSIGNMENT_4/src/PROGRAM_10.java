/*Write a java program to print largest power of three less than or equal to N.
     Sample run:
        Enter a number: 100
        The largest power of 3 less than or equal to 100 is 81
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,a=1;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		while(a<=n/3)
			a*=3;
		System.out.println("The largest power of 3 less than or equal to "+n+" is "+a);
	}
}