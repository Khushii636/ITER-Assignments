/*Write a java program using an array that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input 
ends with 0. Here is a sample run of the program: 
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 
2 occurs 2 times 
3 occurs 1 time 
4 occurs 1 time 
5 occurs 2 times 
6 occurs 1 time 
23 occurs 1 time 
43 occurs 1 time 
Note that if a number occurs more than one time, the plural word 
“times” is used in the output. 
 */
import java.util.*;
public class Program_2{

	public static void main(String[] args) 
    {
		Scanner in= new Scanner(System.in);
		int arr[]=new int[101];
		System.out.print("Enter integers between 1 to 100(last input should be 0): ");
		while(true)
		{
			int a=in.nextInt();
			if (a==0)
				break;
			arr[a]++;
		}
		
		for(int i=1;i<=100;i++)
		{
			if(arr[i]>0)
				System.out.println(i+" occurs "+arr[i]+(arr[i]>1?" times":" time"));
		}
       in.close();
	}
}

        