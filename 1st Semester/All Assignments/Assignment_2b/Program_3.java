/*Write a java program that prints the sum of two random integers between 1 and 6(such as you might get when 
 * rolling dice)
 */
package Assignment_2b;

public class Program_3 {

public static void main(String[] args) 
{
/*  int Llimit,Ulimit,r;
    Llimit=InteProgram_3Int(args[0]);
    Ulimit=Integer.parseInt(args[1]);
    
//		double dr1=Math.random();
//    	System.out.println("Random number1: "+dr1);
//    	double dr2=Llimit+(Ulimit-Llimit)*dr1;
//    	System.out.println("Random number2: "+dr2);
//    	
//    	r=(int)dr2;
//    	System.out.println("Random integer: "+r);
//		
    r=Llimit+(int)((Ulimit-Llimit)*Math.random());
    System.out.println("Random integer: "+r);    */
    
    int a,b;
    a=1+(int)((6)*Math.random());
    b=1+(int)((6)*Math.random());
    int sum=a+b;
    System.out.println("the sum of "+a+" and "+b+" is "+sum);
    
    
}

}

