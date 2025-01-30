/* The selection-sort method repeatedly finds the smallest number in the current array and swaps it 
with the first. Write a java program that reads in ten integer values, invoke the method, and 
displays the sorted elements.*/

 import java.util.*;
 public class Program_12{
 
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int a[]=new int[10];
         System.out.print("Enter ten numbers: ");
         for(int i=0;i<10;i++)
             a[i]=in.nextInt();
             System.out.println("Array before Sorting");
             System.out.println(Arrays.toString(a));
             selectionSort(a,10);
             System.out.println("Array after Sorting");
             System.out.println(Arrays.toString(a));
             in.close();
        
     }
     public static void selectionSort(int[] arr,int n){
        int temp,min;
         for (int i = 0; i < n - 1; i++) {
            min= i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min= j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;           
        }
    }
 }
 