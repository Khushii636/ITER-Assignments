/*Write a sort method that uses the bubble-sort algorithm. The bubble sort algorithm makes 
several passes through the array. On each pass, successive neighbouring pairs are compared. If a 
pair is not in order, its values are swapped; otherwise, the values remain unchanged. The 
technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” 
their way to the top and the larger values “sink” to the bottom. Write a java program that reads 
in ten double numbers, invokes the method, and displays the sorted numbers.    
 */

import java.util.*;
public class Program_11{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        double a[]=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++)
        	a[i]=in.nextDouble();
        System.out.println("Array before Sorting");
        System.out.println(Arrays.toString(a));
        bubbleSort(a,10);
        System.out.println("Array after Sorting");
        System.out.println(Arrays.toString(a));
		in.close();
       
    }
    public static void bubbleSort(double arr[], int n){
        int i, j;
        double temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
