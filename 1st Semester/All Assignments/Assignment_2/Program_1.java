/*Write a java program that reads a Fahrenheit degree in a double value from the console, then 
*converts it to Celsius and displays the result. The formula for the conversion is as follows:
*Celsius = (Fahrenheit-32) *(5/9)
* Hint: Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
* Here is a sample run:
*    Enter a degree in Fahrenheit: 54 
*    54 Fahrenheit is 12.22 Celsius
 */
package Assignment_2;
import java.util.*;
public class Program_1 {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double f,c;
		System.out.print("Enter a degree in Fahrenheit: ");
		f=in.nextDouble();
		c=(f-32)*(5.0/9);
		System.out.println(f+" Fahrenheit is "+c+" celcius");
		in.close();
	}

}
