/*Write a java program to find the second largest value in an array of n elements*/
import java.util.*;

public class Program_5c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter the size of the array: ");
        int n = in.nextInt();
        int[] list = new int[n];
        System.out.print( "Enter "+n+" elements ");
        for (int i = 0 ; i < n ; i++){
            list[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(list));
        pass(list, n-1);
        pass(list, n-2);
        for(int i = n-2 ; i >=0 ; i--){
            if (checkDuplicate(list, i, i+1)) {
                pass(list, i-1);
                continue;
            }else{
                System.out.println("Second largest number is "+list[i]);
                System.exit(0);
                break;
            }

        }
        System.out.println("All elements are equal ");

    }
    static void pass( int[] list , int end){
        for (int i = 0; i < end; i++) {
            if ( list [i]> list [i+1]){
                swap(list , i ,i+1);
            }
        }
    }
    static void swap (int[] list , int f , int s ){
        int temp = list[s];
        list[s] = list [f];
        list [f] = temp;
    }
    static boolean checkDuplicate(int[] list , int o ,int t ){
        return (list[o] == list[t]? true :false);
    }


}
