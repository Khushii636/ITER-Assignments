/*A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (i.e., the 
polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is Area = ((𝑛 × S*S)/(4*tan(pie/n))
 Write a method that returns the area of a regular polygon using the following header: 
public static double area(int n, double side) 
 */
package Assignment_6;
import java.util.*;
public class Program_5 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of sides of the polygon: ");
        int n=in.nextInt();
        System.out.print("Enter the length of each side: ");
        double s=in.nextDouble();
        double area=area(n,s);
        System.out.println("Area of the "+n+" sided polygon with length ="+s+" is "+area); 
        in.close();       
    }

    public static double area(int n, double side) 
    {
        double Area = ((n*side*side)/(4*Math.tan(Math.PI/n)));
        return Area;
    }
}


