/*Write a java program that takes two positive integers from command-line arguments and prints the result of first number raise to 
 * the power of second number
 */
package Assignment_2b;
public class Program_2 {

	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		int pow=(int)Math.pow(a,b);
		System.out.println(a+" to the power "+b+" is "+pow);
		
	}

}



