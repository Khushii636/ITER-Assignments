/*Write a program that generates a random integer number between 1 to 10 and asks the user to guess what the number is. If the user's 
 * guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the 
 * random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly 
 * guesses the random number and display good guess.
    Sample run:
      Computer guess: 7
      User guess: 5
      Too low, try again
      Computer guess: 5
      User guess: 7
      Too high, try again
      Computer guess: 5
      User guess: 5
      Good guess

 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,cmp;
		do {
			System.out.print("User guess: ");
			n=in.nextInt();
			cmp=1+(int)((10-1)*Math.random());
			System.out.print("Computer guess: "+cmp);
			if(cmp>n)
				System.out.println("\nToo low, try again.");
			else if(cmp<n)
				System.out.println("\nToo high, try again.");
		}
		while(cmp!=n);
		System.out.println("\nGood Guess");
	}
}
