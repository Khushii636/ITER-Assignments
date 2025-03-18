/*Write a method to add two matrices. The header of the method is as follows: 
 public static double[][] addMatrix(double[][] a, double[][] b) 
In order to be added, the two matrices must have the same dimensions and the same or 
compatible types of elements. */
import java.util.*;
public class HQ4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int r=in.nextInt();
		int c=in.nextInt();
		double arr1[][]=new double[r][c];
        double arr2[][]=new double[r][c];
		System.out.print("Enter elements of 1st 2D-Array: ");
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
				{
				arr1[i][j]=in.nextDouble();
				}
			}
        System.out.print("Enter elements of 2nd 2D-Array: ");
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
				{
				arr2[i][j]=in.nextDouble();
				}
			}
            double ans[][]=addMatrix(arr1, arr2);
            System.out.println("Addition of both the arrays is");
            for(int i=0;i<r;i++)
                {
                for(int j=0;j<c;j++)
                    {
                    System.out.print(ans[i][j]+" ");
                    }
                    System.out.println();
                }  
        }
        public static double[][] addMatrix(double[][] a, double[][] b) 
        {
            double add[][]=new double[a.length][a[0].length];
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    add[i][j]=a[i][j]+b[i][j];
                }
            }
            return add;
        }  
}
		
