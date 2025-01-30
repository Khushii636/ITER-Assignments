/*Alice visited SUM hospital to get treatment for her fever and illness. Doctor advised her to drink at least 5000 ml of water each day.
 *Alice drank x ml of water today. Write a program that print the following message depending on the value of x.
       “Yes, Alice is following doctor’s advice” 
                        OR
       “No, Alice is not following doctor’s advice”
 */
package Assignment_3;
import java.util.Scanner;
public class Program_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x;
		System.out.print("enter how much ml of water Alice drank: ");
		x=in.nextInt();
		if(x>=5000)
			System.out.println("Yes, Alice is following doctor's advice");
		else
			System.out.println("No, Alice is not following doctor's advice");
	    in.close();
}

}


