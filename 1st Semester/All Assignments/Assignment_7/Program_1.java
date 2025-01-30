/*Write a java program to create an array of size N and store the random values in it and find the sum and average. */
import java.util.*;
public class Program_1{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int N= in.nextInt();
        double a[]=new double[N];
        System.out.print("enter upper and lower limit: ");
        int l=in.nextInt();
        int u=in.nextInt();
        double sum=0,avg;
        for(int i=0;i<N;i++)
        {
            a[i]=l+((u-l)*Math.random());
            sum+=a[i];
        }
        avg=sum/N;
        System.out.println("the array created is:");
        for(int i=0;i<N;i++)
            System.out.print(a[i]+" ");
        System.out.println("\nSum= "+sum);
        System.out.println("Average= "+avg);
        in.close();
    }
}

        
            
    
        
		