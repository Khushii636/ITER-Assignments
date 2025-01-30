/* Some websites impose certain rules for passwords.  
Write a method that checks whether a string is a valid password. Suppose the password rules 
are as follows: 
   A password must have at least eight characters. 
   A password consists of only letters and digits. 
   A password must contain at least two digits.  
Write a program that prompts the user to enter a password and displays Valid Password if the 
rules are followed or Invalid Password otherwise.
 */
package Assignment_6;
import java.util.*;
public class Program_9 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the password: ");
		String s = in.next();
		System.out.println(validPassword(s));
        in.close();       
    }

    static String validPassword(String str) {
		if(str.length() < 8 || (!(noSpecialCharacter(str))) || (!(countDigit(str)))) 
			return "Invalid Password";
		return "Valid Password";
	}
	static boolean noSpecialCharacter(String str ) {
		for (int i = 0 ; i < str.length();i++) 
        {
            char ch= str.charAt(i);
			if(!((ch>='0' && ch <= '9')||(ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))) 
				return false;
			}
		return true ;
	}
	static boolean countDigit(String str) {
		int count = 0 ;
		for (int i = 0 ; i< str.length() ; i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
				count ++;
                if(count  > 1) 
				return true ;
            }
		return false;	
	}
}
