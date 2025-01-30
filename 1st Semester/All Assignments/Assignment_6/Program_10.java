/* Write a java program to calculate the area of triangle, square, circle, rectangle by using method overloading.*/
package Assignment_6;
import java.util.*;
public class Program_10 {

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
		System.out.println("1: Area of triangle \n2: Area of square \n3 : Area of circle \n4 :Area of rectangle");
		System.out.print("Enter your choice: ");
		int ch = in.nextInt();
		switch (ch) {
			case 1:
				System.out.print("You chose traingle \nEnter base and height: ");
				System.out.println(area(in.nextDouble(),in.nextDouble()));
				break;
			case 2:
				System.out.print("You chose Square \nEnter a side: ");
				System.out.println(area(in.nextInt()));
				break;
			case 3:
				System.out.print("You chose circle \nEnter radius: ");
				System.out.println(area(in.nextDouble()));
				break;
			case 4:
				System.out.print("You chose rectangle \nEnter base and height: ");
				System.out.println(area(in.nextInt(),in.nextInt()));
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		
		}
		
		in.close();
	}
	static double area(double base ,double height ) {
		return 0.5*base*height;
	}
	static int area(int side) {
		return side*side;
	}
	static int area(int base ,int height) {
		return base*height;
	}
	static double area(double r ) {
		return Math.PI*r*r;
	}

}