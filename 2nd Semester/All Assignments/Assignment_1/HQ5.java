/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
and finds the first row and column with the most 1s. */
import java.util.*;
public class HQ5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[][]=new int[4][4];
        for(int i=0;i<4;i++)
			{
			for(int j=0;j<4;j++)
				{
				arr[i][j]=(int)(2*Math.random());
				}
			}
		System.out.println("Generated matrix");
		for(int i=0;i<4;i++)
			{
			for(int j=0;j<4;j++)
				{
                    System.out.print(arr[i][j]+" ");
				}
                System.out.println();
			}
            int maxRowIndex = 0, maxRowCount = 0;
            for (int i = 0; i < 4; i++) {
                int rowCount = 0;
                for (int j = 0; j < 4; j++) {
                    if (arr[i][j] == 1) {
                        rowCount++;
                    }
                }
                if (rowCount > maxRowCount) {
                    maxRowCount = rowCount;
                    maxRowIndex = i;
                }
            }
            int maxColIndex = 0, maxColCount = 0;
            for (int j = 0; j < 4; j++) {
                int colCount = 0;
                for (int i = 0; i < 4; i++) {
                    if (arr[i][j] == 1) {
                        colCount++;
                    }
                }
                if (colCount > maxColCount) {
                    maxColCount = colCount;
                    maxColIndex = j;
                }
            }
            System.out.println("The largest row index: " + maxRowIndex);
            System.out.println("The largest column index: " + maxColIndex);
        }
    }