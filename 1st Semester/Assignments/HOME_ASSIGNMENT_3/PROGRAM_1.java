/*Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut a paper, a rock can knock a scissor, and a 
 *paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
 * the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. 
             Here are sample runs: 
                 scissor (0), rock (1), paper (2): 1 
                 The computer is scissor. You are rock. You won
                 
                 scissor (0), rock (1), paper (2): 2 
                 The computer is paper. You are paper too. It is a draw
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int choice,cmp;
		System.out.print("scissor (0), rock (1), paper (2): ");
		choice=in.nextInt();
		cmp=1+(int)((3-1)*Math.random());
		if(choice==0)
		{
			if(cmp==0)
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			else if(cmp==1)
				System.out.println("The computer is rock. You are scissor. Computer won");
			else if(cmp==2)
				System.out.println("The computer is paper. You are scissor. You won");
		}
		else if(choice==1)
		{
			if(cmp==0)
				System.out.println("The computer is scissor. You are rock. You won");
			else if(cmp==1)
				System.out.println("The computer is rock. You are rock too. It is a draw");
			else if(cmp==2)
				System.out.println("The computer is paper. You are rock. Computer won");
		}
		else if(choice==2)
		{
			if(cmp==0)
				System.out.println("The computer is scissor. You are paper. Computer won");
			else if(cmp==1)
				System.out.println("The computer is rock. You are paper. You won");
			else if(cmp==2)
				System.out.println("The computer is paper. You are paper too. It is a draw");
		}
			
	}

}

