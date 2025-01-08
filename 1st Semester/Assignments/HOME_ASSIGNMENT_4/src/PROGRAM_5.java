/*Write a java program to print the following output using loop. Where, input is the number of rows in output pattern.
             For input, N = 4.
             1
             121
             1213121
             121312141213121

 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		String s="";
		System.out.print("For input, N = ");
		n=in.nextInt();
		for(int i=1;i<=4;i++)
			{
			s=s+i+s;
			System.out.println(s);
			}
	}
}