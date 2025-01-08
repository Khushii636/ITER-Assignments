/*Write a Java program that takes a year from user and print true if that year is a leap year otherwise print false. 
         Here is a sample run:
                 Input the year: 2016
                 2016 is a leap year: true
                 
                 Input the year: 2008
                 2008 is a leap year: false
                 
                 Input the year: 1900
                 1900 is a leap year: fals
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int yr;
		boolean bl;
		System.out.print("Input the year: ");
		yr=in.nextInt();
		if((yr%4==0)&&((yr%100!=0)||(yr%400==0)))
				bl=true;
		else
			    bl=false;
		System.out.println(yr+" is a leap year: "+bl);
		
	}

}