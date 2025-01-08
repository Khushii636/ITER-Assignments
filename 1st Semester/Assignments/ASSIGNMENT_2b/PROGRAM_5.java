
/*Write a java program that takes three int values from the command line and prints them in ascending order
 * .use Math.min() and Math.max()
 * Author: Khushi Choudhary
 * Branch: CSE
 */
public class PROGRAM_5 {

	public static void main(String[] args) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		int min=Math.min((Math.min(a,b)),c);
		int max=Math.max((Math.max(a,b)),c);
		int mid=(a+b+c-min-max);
		System.out.println("Ascending Order");
		System.out.println(min+"<"+mid+"<"+max);
		
		
		
	}

}
