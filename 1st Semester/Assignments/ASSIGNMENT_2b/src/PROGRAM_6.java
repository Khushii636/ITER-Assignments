/*Write a java program to input a character from command line and display the ASCII value of the entered character.
 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
public class PROGRAM_6 {

	public static void main(String[] args) 
	{
		char ch=args[0].charAt(0);
	    System.out.println("the input character is: "+ch);
	    System.out.println("the ASCII value of "+ch+" is "+(int)ch);
	}
}