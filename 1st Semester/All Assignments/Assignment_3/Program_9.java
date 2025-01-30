/*Write a program to input 3 integer number a, b, c. Find the largest number among 3. Also find the 2nd largest number among 3. 
 *     Here is the sample output:
             Enter the value of a, b, c:10 30 50
             Largest number: 50
             2nd largest number: 30
 */
package Assignment_3;
import java.util.Scanner;
public class Program_9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the value of a, b, c:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Largest number: "+a);
			    if(b>c)
			    	System.out.println("2nd largest number: "+b);
			    else
			    	System.out.println("2nd largest number: "+c);
			}
			else 
			{
				System.out.println("Largest number: "+c);
			    System.out.println("2nd largest number: "+a);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Largest number: "+b);
			    if(a>c)
			    	System.out.println("2nd largest number: "+a);
			    else
			    	System.out.println("2nd largest number: "+c);
			}
			else 
			{
				System.out.println("Largest number: "+c);
			    System.out.println("2nd largest number: "+b);
			}
		}
			
	    in.close();	
	

}
}

