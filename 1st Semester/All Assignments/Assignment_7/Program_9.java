/*You can compute the standard deviation with the following formula; you have to store the individual numbers using an array, so that 
 * they can be used after the mean is obtained. 
 * 𝑚𝑒𝑎𝑛 =∑i=1 to n ((x(i))/n) = (x(1)+...x(n))/n
 * 𝑑𝑒𝑣𝑖𝑎𝑡𝑖𝑜𝑛 = sqroot(∑i=1 to n sq(𝑥(i) − 𝑚𝑒𝑎𝑛)/n-1)
 
 * Your program should contain the following methods: 
           Compute the deviation of double values
             public static double deviation(double[] x) 
           Compute the mean of an array of double values
             public static double mean(double[] x)
             
 * Write a java program that prompts the user to enter ten numbers and displays the mean and standard deviation, as shown in the 
 * following sample run: 
         Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2 
         The mean is 3.11 
         The standard deviation is 1.55738 
 */
import java.util.*;
public class Program_9{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        double a[]=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++)
        	a[i]=in.nextDouble();
        System.out.println("The mean is "+mean(a));
        System.out.println("The standard deviation is "+deviation(a));
        in.close();
    }
	public static double mean(double[] x)
	{
		double sum=0;
		for(int i=0;i<x.length;i++)
			sum+=x[i];
		return sum/x.length;
	}
	
	public static double deviation(double[] x)
	{
		double sum=0;
		for(int i=0;i<x.length;i++)
			sum+=Math.pow((x[i]-mean(x)),2);
		return Math.sqrt(sum/(x.length-1));
	}
	
}