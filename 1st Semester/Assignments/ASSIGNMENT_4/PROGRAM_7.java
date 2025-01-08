/*Write a java program to print the multiplication table of a number entered by the user.
      Sample run:
         Enter a no. for which you want to find the multiplication table: 
         8
        The multiplication table of 8 is:
        8x1=8
        8x2=16
        8x3=24
        8x4=32
        8x5=40
        8x6=48
        8x7=56
        8x8=64
        8x9=72
        8x10=80
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a no. for which you want to find the multiplication table:");
		n=in.nextInt();
		System.out.println("The multiplication table of 8 is:");
		for(int i=1;i<=10;i++)
			System.out.println(n+"x"+i+"="+(n*i));
	}
}
			
		