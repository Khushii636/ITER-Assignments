/*Write a Java program that takes two arrays a and b of length n storing int values, and returns 
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], 
for i = 0, . . . , n − 1. 
*/
import java.util.*;
public class HQ3 {

   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n=in.nextInt(); 
       int arr1[]=new int[n];
       int arr2[]=new int[n];
       int arr3[]=new int[n];
       System.out.print("Enter "+n+" values for 1st Array: ");
              for(int i=0;i<n;i++)
                 arr1[i]=in.nextInt();

        System.out.print("Enter "+n+" values for 2nd Array: ");
            for(int i=0;i<n;i++)
                arr2[i]=in.nextInt();

        for(int i=0;i<n;i++)
            arr3[i]=arr1[i]*arr2[i];

        System.out.println(Arrays.toString(arr3));
        
    }
}	
       
