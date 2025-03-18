/*Write a java program to find the maximum and minimum and how many times they both occur in an array of n elements. Find out the positions where 
 *the maximum first occurs and the minimum last occurs.

Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3.
 */
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int max=arr[0];
		int min=arr[0];
		int c1=1,c2=1,f1=1,l1=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
				{
				max=arr[i];
				c1=1;
				f1=i+1;
				}
			else if(arr[i]==max)
				c1++;
			if(arr[i]<min)
			{
				min=arr[i];
				c2=1;
				l1=i+1;
			}
			else if(arr[i]==min)
				{
				c2++;
			    l1=i+1;
				}
		}
		
		System.out.println("Maximum element of Array is "+max+" and occurs "+c1+" times");
		System.out.println("Minimum element of Array is "+min+" and occurs "+c2+" times");
		System.out.println("First occurrence of maximum element is at position "+f1);
		System.out.println("last occurrence of minimum element is at position "+l1);
}
}