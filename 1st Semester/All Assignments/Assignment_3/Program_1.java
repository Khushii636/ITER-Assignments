/*Write a program to input the age of a person and check if the age of the person is greater than or equal to 18 then print the message
 *    “You are eligible to cast your vote”.
 */
package Assignment_3;
import java.util.Scanner;
public class Program_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int age;
		System.out.print("enter age of the person: ");
		age=in.nextInt();
		if(age>=18)
			System.out.println("you are eligible to cast your vote");
		else
			System.out.println("you are not eligible to cast your vote");
	    in.close();
}

}