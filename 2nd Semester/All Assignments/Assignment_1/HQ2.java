/*Write a Java program that takes all the lines input to standard input and writes them to 
standard output in reverse order. That is, each line is output in the correct order, but the 
ordering of the lines is reversed. 
*/
import java.util.*;
public class HQ2 {

   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.print("Enter the number of lines: ");
       int n=in.nextInt(); 
       in.nextLine();
       String s[]=new String[n];
       System.out.println("Enter "+n+" lines");
        for(int i=0;i<n;i++)
            s[i]=in.nextLine();
        System.out.println("Reverse Order:");
        for (int i = n-1; i >= 0; i--) 
            System.out.println(s[i]);
        
    }
}	
       