/*Write a java program to take an integer input from the user and print the input by removing all zeros. 
   Example: Input = 10200 then Output = 12.
          Sample run:
           Enter an integer number: 10203040
           After removing 0 from number 10203040, the new number is 1234. 
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.*;
public class PROGRAM_9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter an integer number: ");
		n=in.nextInt();
		String n1="",s;
		s=n+"";
		for(int i=0;i<s.length();i++)
			{
			if(s.charAt(i)!='0')
				n1+=s.charAt(i);
			}
		System.out.println("After removing 0 from number "+n+", the new number is "+n1);
				}
		
	}
//int f=(int)Math.pow(10,(n+"").length()-1;
//System.out.print("After removing 0 from number "+n+", the new number is ");
//while(n!=0)
//{
//	if((n/f)!=0)
//		System.out.print(n/f);
//	n=n/10;

				
		