 /*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double values using the following header:
     public static double sumMajorDiagonal(double[][] m)
  Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal. 
     Sample Run:
        Enter a 4-by-4 matrix row by row:
        1 2 3 4.0
        5 6.5 7 8
        9 10 11 12
        13 14 15 16
        Sum of the elements in the major diagonal is 34.5
 */
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int r=in.nextInt();
		int c=in.nextInt();
		double arr[][]=new double[r][c];
		System.out.print("Enter a "+r+"-by-"+c+" matrix row by row:");
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
				{
				arr[i][j]=in.nextDouble();
				}
			}
		
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
	}
	
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum=0;
		for(int i=0;i<m.length;i++)
		{
		for(int j=0;j<m[i].length;j++)
			{
			if(i==j)
				sum+=m[i][j];
			}
		}
		return sum;
	}
}
		