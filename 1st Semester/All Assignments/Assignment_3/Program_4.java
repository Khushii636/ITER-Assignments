/*Make a simple game involving a computer and a user. The computer first guesses a number between 1 and 9 inclusive, then ask the user 
 * to enter a number between 1 and 9 inclusive. If the user guess is correct then display “You got it right”, if the guess is close 
 * (+1, -1) “Almost got it “, Otherwise “You got it wrong”. 
       Here are some sample runs.
               Enter user number: 2
               Computer guesses: 3
               “Almost got it”

               Enter user number: 4
               Computer guesses: 4
               “You got it right”
               
               Enter user number: 1
               Computer guesses: 5
               “You got it wrong”
 */
package Assignment_3;
import java.util.Scanner;
//import java.util.Random;
public class Program_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num1, num2, diff;
//		Random rn = new Random();
//		num2= rn.nextInt(9)+1;
		System.out.print("Enter user number: ");
		num1 = in.nextInt();
		num2=1+(int)((9)*Math.random());
		System.out.println("Computer guesses: "+num2);
		diff = num2-num1;
		if(diff==1) {
			System.out.println("\"Almost got it\"");
		}
		else if(diff==0) {
			System.out.println("You got it right\"");
		}
		else
			System.out.println("You got it wrong\"");
        in.close();
	}

}
