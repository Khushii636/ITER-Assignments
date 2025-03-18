/*Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
    public static double sumColumn(double[][] m, int columnIndex)
      Write a java program that reads a 3-by-4 matrix and displays the sum of each column.
          Sample Run:
                Enter a 3-by-4 matrix row by row: 
                1.5 2 3 4
                5.5 6 7 8
                9.5 1 3 1
                Sum of the elements at column 0 is 16.5
                Sum of the elements at column 1 is 9.0
                Sum of the elements at column 2 is 13.0
                Sum of the elements at column 3 is 13.0
             
 * Author: Khushi Choudhary
 * Regd No: 24E103A30
 * Section: 24E1B2
 * Branch: CSE
 */
import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int r=in.nextInt();
		int c=in.nextInt();
		double s=0;
		double arr[][]=new double[r][c];
		System.out.print("Enter a "+r+"-by-"+c+" matrix row by row:");
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
				{
				arr[i][j]=in.nextDouble();
				}
			}
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		for (int k=0;k<c;k++)
		{
			s=sumColumn(arr,k);
			System.out.println("Sum of the elements at column "+k+" is "+s);
	}
	}
	
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum=0;
		for(int j=0;j<m.length;j++)
			{
				sum+=m[j][columnIndex];
			}
		return sum;
}
	}
	