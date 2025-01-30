/*Write a java program that displays the following table. Cast floating-point numbers into 
integers.
 * a  b  pow(a,b)
 * 1  2  1
 * 2  3  8
 * 3  4  81
 * 4  5  1024
 * 5  6  15625
 */
package Assignment_2;
public class Program_7 
{

	public static void main(String[] args) 
	{
		int a=1,b=a+1;
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		++a;
		++b;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		++a;
		++b;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		++a;
		++b;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		++a;
		++b;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
    }

}


