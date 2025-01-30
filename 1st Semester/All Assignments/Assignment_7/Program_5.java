/*Write a java program to find the second largest value in an array of n elements*/
import java.util.*;
public class Program_5{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n= in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter distinct element no "+(i+1)+": ");
            a[i]=in.nextInt();
        }
        
        System.out.println("the array created is:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
                            
        }
                        
        
        System.out.println("\nthe second largest value in the array is: "+a[n-2]);
        in.close();
    }
}

        