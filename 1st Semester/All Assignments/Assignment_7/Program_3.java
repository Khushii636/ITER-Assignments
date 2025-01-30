/*Input 10 integers from the keyboard into an array. The number to be searched is entered through the keyboard by the user. Write a 
java program to find if the number to be searched is present in the array and if it is present, display the number of times it appears 
in the array.
 */
import java.util.*;
public class Program_3{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int a[]=new int[10];

        for(int i=0;i<10;i++)
        {
            System.out.print("enter element no "+(i+1)+": ");
            a[i]=in.nextInt();
        }

        System.out.print("enter the number to be searched: ");
        int n= in.nextInt();
        int count=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]==n)
            count++;
        }

        System.out.println("the array created is:");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");

        if(count==0)
        System.out.println("\n"+n+" not present in the array");
        else if(count==1)
        System.out.println("\n"+n+" appears only one time in the array");
        else 
        System.out.println("\n"+n+" appears "+count+" times in the array");
        in.close();
    }
}

        
            
    
        