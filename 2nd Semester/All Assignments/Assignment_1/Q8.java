/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of elements of the array. 
    Sample Run:
      Enter number of Row and Columns of 2D-Array: 3 3
      Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
      The elements of 2D array are:
       1 2 3
       2 3 4
       3 4 5
       The sum of elements of the 2D-Array is 27
 */
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int r=in.nextInt();
		int c=in.nextInt();
		int arr[][]=new int[r][c];
		int s=0;
		System.out.print("Enter elements of 2D-Array: ");
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
				{
				arr[i][j]=in.nextInt();
				}
			}
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			System.out.print(arr[i][j]+" ");
			s+=arr[i][j];
			}
		System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is "+s);
	}
}
		