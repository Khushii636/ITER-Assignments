/* Write a java method to check a string is palindrome or not.*/
package Assignment_6;
import java.util.*;
public class Program_8 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=in.nextLine();
        if(isPalindrome(s))
        System.out.println("It is a Palindrome String");
        else
        System.out.println("It is not a Palindrome String"); 
        in.close();       
    }

public static boolean isPalindrome(String str)
{
    String s="";
    for(int i=str.length()-1;i>=0;i--)
    {
        s+=str.charAt(i);
    }
     if(str.equals(s))
    return true;
    else
    return false;
}
}
