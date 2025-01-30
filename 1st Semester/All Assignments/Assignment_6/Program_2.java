/*A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . 
Write a method with the following header that returns a pentagonal number: 
public static int getPentagonalNumber(int n) 
Write a java program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line. 
 */
package Assignment_6;
public class Program_2 {

	public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            System.out.print(getPentagonalNumber(i)+" ");
            if(i%10==0)
            System.out.println();
        }
        
}
public static int getPentagonalNumber(int n) 
{
    int num=n*(3*n-1)/2;
    return num;
}
}

