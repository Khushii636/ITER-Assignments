/*A University conducts a 100-mark exam for its student and grades them as follows. Assigns a grade based on the value of the marks. 
 * Write a java program to print the grade according to the mark secured by the student. [Use switch-case].
                               Mark Range Letter Grade
                                  >=90         O
                              >=80 AND <90     A
                              >=70 AND <80     B
                              >=60 AND <70     C
                              >=50 AND <60     D
                              >=40 AND <50     E
                                  <40          F

 * Author: Khushi Choudhary
 * Regd No: 24108301
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int marks;
		System.out.print("enter the marks of the student: ");
		marks=in.nextInt();
		switch(marks/10)
		{	case 10:
			case 9:
				System.out.println("O grade");
				break;
			case 8:
				System.out.println("A grade");
				break;
			case 7:
				System.out.println("B grade");
				break;
			case 6:
				System.out.println("C grade");
				break;
			case 5:
				System.out.println("D grade");
				break;
			case 4:
				System.out.println("E grade");
				break;
			default:
				System.out.println("F grade");
	 }

}
}
