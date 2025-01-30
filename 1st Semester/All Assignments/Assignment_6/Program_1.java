/*Design a Simple Calculator using methods in java containing the following functionalities, 
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The 
signature of the methods are given below. 
    public static int additionSimple(int x, int y) 
    Two inputs, x and y. Return the result of adding x to y. 

    public static int subtractionSimple(int x, int y) 
    Two inputs, x and y. Return the result of subtracting x from y i.e y-x. 

    public static int multiplicationSimple(int x, int y) 
    Two inputs, x and y. Return the result of multiplying x to y i.e. x*y. 

    public static double divisionSimple(int x, int y) 
    Two inputs, x and y. Return the result of dividing y by x. Please check whether x is zero before dividing. 

    public static int remainderSimple(int n, int m) 
    Please make sure that remainderSimple() takes two inputs, namely, a number (int) n and a number (int) m. The method should return 
    the remainder of n divided by m. 

    public static double squareRootSimple(int n) 
    Takes one input, namely a number n, and returns the square root of the number. 
    The return should be double. Please kindly make sure that the number n is positive.
 */
package Assignment_6;
import java.util.*;
public class Program_1 {

	public static void main(String[] args) {

        int c,n1,n2;
        Scanner in=new Scanner(System.in);
        while(true){
        System.out.println("1. ADDITION");
        System.out.println("2. SUBSTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. REMAINDER");
        System.out.println("6. SQUARE ROOT");
        System.out.println("7. EXIT");
        System.out.print("Enter the number of your choice: ");
        c=in.nextInt();
        switch (c) {
            case 1:
                System.out.print("Enter the first number: ");
                n1=in.nextInt();
                System.out.print("Enter the second number: ");
                n2=in.nextInt();
                System.out.println("the sum of "+n1+" and "+n2+" is "+additionSimple(n1,n2));
                break;
            case 2:
                System.out.print("Enter the first number: ");
                n1=in.nextInt();
                System.out.print("Enter the second number: ");
                n2=in.nextInt();
                System.out.println("the difference of "+n1+" and "+n2+" is "+subtractionSimple(n1,n2));  
                break;
            case 3:
                System.out.print("Enter the first number: ");
                n1=in.nextInt();
                System.out.print("Enter the second number: ");
                n2=in.nextInt();
                System.out.println("the product of "+n1+" and "+n2+" is "+multiplicationSimple(n1,n2));  
                break;
            case 4:
                System.out.print("Enter the divisor: ");
                n1=in.nextInt();
                System.out.print("Enter the divident: ");
                n2=in.nextInt();
                if(n1==0)
                System.err.println("not valid");
                else
                System.out.println("the division of "+n2+" by "+n1+" is "+divisionSimple(n1,n2));  
                break;
            case 5:
                System.out.print("Enter the divident: ");
                n1=in.nextInt();
                System.out.print("Enter the divisor: ");
                n2=in.nextInt();
                System.out.println("the remainder of "+n1+" divided by "+n2+" is "+remainderSimple(n1,n2));  
                break;
            case 6:
                System.out.print("Enter the number: ");
                n1=in.nextInt();
                if(n1<0)
                System.err.println("not valid");
                else
                System.out.println("the square root  of "+n1+" is "+squareRootSimple(n1));  
                break;
            case 7:
                System.exit(0);
                break;
            default:
            System.out.println("INVALID CHOICE");

		}
    }
    
    
}
    public static int additionSimple(int x, int y)
    {
        int z=x+y;
        return z;
    }
    public static int subtractionSimple(int x, int y)
    {
        int z=y-x;
        return z;
    }
    public static int multiplicationSimple(int x, int y)
    {
        int z=x*y;
        return z;
    }
    public static double divisionSimple(int x, int y)
    {
            int z=y/x;
            return z;
    }
    public static int remainderSimple(int n, int m)
    {
        int p=n%m;
        return p;
    }
    public static double squareRootSimple(int n)
    {
        return Math.sqrt(n);
    }
}

