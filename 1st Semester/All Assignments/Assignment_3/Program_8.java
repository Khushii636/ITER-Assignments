/*Write a java program that takes the x – y coordinates of a point in the Cartesian plane and prints a message telling either an axis 
 * on which the point lies or the quadrant in which it is found.
                     Here is the sample output: 
                           (-1.0, -2.5) is in quadrant III 
                           (0.0, 4.8) is on the y-axis
 */
package Assignment_3;
import java.util.Scanner;
public class Program_8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double x,y;
		System.out.print("enter x coordinate: ");
		x=in.nextDouble();
		System.out.print("enter y coordinate: ");
		y=in.nextDouble();
		if(x==0)
			System.out.println("("+x+", "+y+") is on the y-axis");
		else if(y==0)
			System.out.println("("+x+", "+y+") is on the x-axis");
		else if(x>0 && y>0)
			System.out.println("("+x+", "+y+") is in quadrant I");
		else if(x>0 && y>0)
			System.out.println("("+x+", "+y+") is in quadrant I");
		else if(x<0 && y>0)
			System.out.println("("+x+", "+y+") is in quadrant II");
		else if(x<0 && y<0)
			System.out.println("("+x+", "+y+") is in quadrant III");
		else if(x>0 && y<0)
			System.out.println("("+x+", "+y+") is in quadrant IV");
		
		
        in.close();	
    }

}

