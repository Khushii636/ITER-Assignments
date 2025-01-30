/*Design and develop a menu driven java program for the following array operations. 
       a. Create an array of N integers 
       b. Display the array elements 
       c. Insert an element at specific position 
       d. Delete an element at a given position 
       e. Exit 
 */
import java.util.*;
public class Program_8{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]=create();
		char ch;
		while(true)
		{
		System.out.println("a. Create an array of N integers \r\n" + 
						"b. Display the array elements \r\n" + 
						"c. Insert an element at specific position \r\n" + 
						"d. Delete an element at a given position \r\n" + 
						"e. Exit \r\n" 
						);
	System.out.print("Enter your Choice: ");
	ch=in.next().charAt(0);
	switch(ch)
	{
		case 'a': case 'A':
		arr=create();
		System.out.println("Array created successfully");
		break;
		case 'b': case 'B':
		display(arr);
		System.out.println();
		break;
		case 'c': case 'C':
		arr=insert(arr);
		System.out.println("Array updated successfully");
		break;
		case 'd': case 'D':
		arr=delete(arr);
		System.out.println("Array updated successfully");
		break;
		case 'e': case 'E':
		System.exit(0);
		break;
		default:
		System.out.println("INVALID CHOICE");
	}
}
}
	public static int[] create()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("enter the value of N: ");
		int N= in.nextInt();
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
        {
            System.out.print("enter element no "+(i+1)+": ");
            a[i]=in.nextInt();
        }
		return a;
		
	}
	public static void display(int arr[])
	{
		System.out.println("the array created is:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
	}

	public static int[] insert(int arr[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the position where u want to insert: ");
		int k=in.nextInt();
		System.out.println("Enter the element u want to insert: ");
		int e=in.nextInt();
		int a[]=new int[(arr.length)+1];
        for(int i=0;i<k-1;i++)
            a[i]=arr[i];
		a[k-1]=e;
		for(int i=k;i<a.length;i++)
            a[i]=arr[i-1];
			return a;
	}

	public static int[] delete(int arr[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the position of which u want to delete: ");
		int k=in.nextInt();
		int a[]=new int[(arr.length)-1];
        for(int i=0;i<k;i++)
            a[i]=arr[i];
		for(int i=k;i<arr.length;i++)
            a[i-1]=arr[i];
			return a;
	}
}

