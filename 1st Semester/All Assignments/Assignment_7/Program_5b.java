/*Write a java program to find the second largest value in an array of n elements*/
import java.util.*;
public class Program_5b{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n= in.nextInt();
        int a[]=new int[n];
        int l,sl;
        for(int i=0;i<n;i++)
        {
            System.out.print("enter element no "+(i+1)+": ");
            a[i]=in.nextInt();
        }
        
        System.out.println("the array created is:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            l=a[0];
            sl=Integer.MIN_VALUE;
    
        for(int i=2;i<a.length;i++)
        {
            if(a[i]>l)
            {
                sl=l;
                l=a[i];
            }
            else if(a[i]>=sl&&a[i]!=l)
            sl=a[i];
            
            }
            if (sl==Integer.MIN_VALUE)
            System.out.println("\nNo second largest value exists (all elements might be the same).");
            else
            System.out.print("\nthe second largest value= "+sl);
            in.close();
        }

       
    }

        
