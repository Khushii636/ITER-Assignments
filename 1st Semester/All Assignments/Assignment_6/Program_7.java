/* Write java method called count accepts a string as input and returns the number of vowels in it. The method header is given below. 
public static int count(String str)  
For example, count ("Welcome") returns 2. 
 */
package Assignment_6;
import java.util.*;
public class Program_7 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=in.nextLine();
        System.out.println("the number of vowels(i.e a,e,i,o,u) in "+s+" is "+count(s)); 
        in.close();       
    }

    public static int count(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='0'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            count++;
        }
        return count;
    }
}


