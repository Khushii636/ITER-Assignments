/*Write a java program to convert a decimal integer to its corresponding octal representation.       */
import java.util.*;
public class Program_7{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.print("enter a decimal integer: ");
        int n=in.nextInt();
        int o=0;
        int i=0;
        while(n!=0)
        {
            o+=(n%8)*(int)Math.pow(10,i);
            n/=8;
            i++;
        }
        System.out.println("its corresponding octal representation is: "+o);
        in.close();
}
}
    

        