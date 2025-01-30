/* Write a method that returns a new array by eliminating the duplicate values in the array using 
the following method header: 
public static int[] eliminateDuplicates(int[] list) 
Write a java program that reads in ten integers, invokes the method, and displays the result. 
Here is the sample run of the program: 
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 
The distinct numbers are: 1 2 3 6 4 5   
 */
import java.util.*;
public class Program_10{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++)
        	a[i]=in.nextInt();
            int[] distinctNumbers = eliminateDuplicates(a);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] != 0)
            System.out.print(distinctNumbers[i] + " ");
        }
		in.close();
       }

       public static int[] eliminateDuplicates(int[] list) {
        int[] result = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

               for (int j = 0; j < index; j++) {
                if (list[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[index++] = list[i];
            }
        }

        return result;
    }
		
	 }

