/* Write a method that finds the number of occurrences of a specified character in a string using the following header: 
public static int count(String str, char a)  
   For example, count ("Welcome", 'e') returns 2.  
    Write a java program that prompts the user to enter a string followed by a character and displays the number of occurrences of the
    character in the string.
 */
package Assignment_6;
import java.util.*;
public class Program_6 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=in.nextLine();
        System.out.print("Enter a character: ");
        char ch=in.next().charAt(0);
        System.out.println("the number of occurrences of '"+ch+"' in "+s+" is "+count(s,ch)); 
        in.close();       
    }

    public static int count(String str, char a)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(a==str.charAt(i))
            count++;
        }
        return count;
    }
}


