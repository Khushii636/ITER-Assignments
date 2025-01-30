/*Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in the sequence are generated from the sum of 
their three most recent predecessors. Write a java program to generate this sequence up to n terms where n > 3.
 */
package Assignment_5;
import java.util.*;
public class Program_10{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int a=0,b=1,c=1;
        System.out.print("Enter the number of terms you want: ");
		int n = in.nextInt();
		int sum=a+b+c,temp,temp2;
        System.out.println("The sequence is as follows:");
		System.out.print(a+" "+b+" "+c+" ");
		int count =3;
		while(count<n-1) {
			System.out.print(sum+" ");
			temp = c;
			c=sum;
			temp2 =b;
			b=temp;
			a=temp2;
			sum=a+b+c;
			count++;
		}
		System.out.println(sum);

        in.close();
     }
}
