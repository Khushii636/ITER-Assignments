/*Write a method that finds the smallest element in an array of double values using the following header: 
     public static double min(double[] array) 
 Write a java program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the 
 minimum value. Here is a sample run of the program: 
        Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
        The minimum number is: 1.5  
 */
import java.util.*;
public class Program_4{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        double a[]=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++)
        	a[i]=in.nextDouble();
        System.out.println("The minimum number is: "+min(a));
		in.close();
       
    }
	 public static double min(double[] array) 
	 {
		 double min=array[0];
		 for(int i=1;i<array.length;i++)
		 {
			 if(array[i]<min)
				 min=array[i];
		 }
		 return min;
		 
		}
		
	 }


        