/*WAP to enter the value of n and display find the following sum of the series: 
 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
 */
package Assignment_5;
import java.util.*;
public class Program_8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s=0,n,s1=0;
		System.out.print("Enter the value of n: ");
		n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            s+=i;
        s1+=s;
        }
        System.out.println("sum of the series: "+s1);
        in.close();
    }

    
}


