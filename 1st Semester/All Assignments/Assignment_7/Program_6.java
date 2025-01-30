/*Write a java program that implements the array reversal algorithm suggested in Note 1. 
      Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0 and j=n-1. With each iteration i is 
      increased and j is decreased for i<j.  
 */
import java.util.*;
public class Program_6{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int N= in.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            System.out.print("enter element no "+(i+1)+": ");
            a[i]=in.nextInt();
        }
        
        System.out.println("the array created is:");
        for(int i=0;i<N;i++)
            System.out.print(a[i]+" ");
        
        int i=0,j=N-1,temp;
        while(i<j)
        {
        	temp=a[i];
        	a[i]=a[j];
        	a[j]=temp;
        	i++;
        	j--;
        }
        
        System.out.println("\nthe reversed array is:");
        for(int k=0;k<N;k++)
            System.out.print(a[k]+" ");
        
        in.close();
    }
}

        