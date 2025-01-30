/*Write a java program to input a character from command line and display the ASCII value of the entered character.
 */
package Assignment_2b;
public class Program_6 {

	public static void main(String[] args) 
	{
		char ch=args[0].charAt(0);
	    System.out.println("the input character is: "+ch);
	    System.out.println("the ASCII value of "+ch+" is "+(int)ch);
	}
}
