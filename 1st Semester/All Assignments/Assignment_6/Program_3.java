/*Write the methods with the following headers  
// Return the reversal of an integer. Example: reverse (456), returns 654 
public static int reverse(int number)  
// Return true if number is a palindrome 
public static boolean isPalindrome(int number)  
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is 
the same as itself. Write a java program that prompts the user to enter an integer and reports 
whether the integer is a palindrome.
 */
package Assignment_6;
import java.util.*;
public class Program_3 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=in.nextInt();
        if(isPalindrome(n))
        System.out.println("It is a Palindrome number");
        else
        System.out.println("It is not a Palindrome number"); 
        in.close();       
    }

public static int reverse(int number) 
{
    int num=0;
    while(number!=0)
    {
        num*=10;
        num+=number%10;
        number/=10;
    }
    return num;
}
public static boolean isPalindrome(int number)
{
    if(number==reverse(number))
    return true;
    else
    return false;
}
}


