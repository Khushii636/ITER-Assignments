/*The distance between two cities (in km.) is input through the keyboard. Write a java program 
*to convert and print this distance in meters, feet, inches and centimetres.
*Hint:
*1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch, 
*1km= 100000 centimetre
*  Here is the sample run:
*     Enter the distance in km=165
*     165 km is 165000 meters
*     165 km is 541338.5835 feet
*     165 km is 6496062.9854999995 inch
*     165 km is 16500000 centimetres

 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_2 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int km,m,cm;
		double f,inc;
		System.out.print("Enter the distance between two cities in km=");
		km=in.nextInt();
		m=km*1000;
		f=km*3280.8399;
		inc=km*39370.0787;
		cm=km*100000;
//		System.out.println("the distance between two cities in meters:"+m);
//		System.out.println("the distance between two cities in feet:"+f);
//		System.out.println("the distance between two cities in inches:"+inc);
//		System.out.println("the distance between two cities in centimeters:"+cm);
		System.out.println(km+" km is "+m+" meters");
		System.out.println(km+" km is "+f+" feet");
		System.out.println(km+" km is "+inc+" inches");
		System.out.println(km+" km is "+cm+" centimeters");
	}

}
