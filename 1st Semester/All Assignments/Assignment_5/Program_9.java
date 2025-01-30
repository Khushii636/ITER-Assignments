/*Write a program that will read the value of n from the user and calculate sum of the following series: 
1/1^2+1/2^2+1/3^2....+1/n^2
 */
package Assignment_5;
import java.util.*;
public class Program_9{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		double s=0;
		System.out.print("Enter the value of n: ");
		n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            s+=1.0/(i*i);
        }
		System.out.println("sum of the series: "+s);
        in.close();
     }
    }

    

