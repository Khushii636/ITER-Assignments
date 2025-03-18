/*Write a Java program that takes as input three integers, a, b, and c, from the Java console 
and determines if they can be used in a correct arithmetic formula (in the given order), like 
“a + b = c,” “a = b − c,” or “a b = c.”∗
* Author: Khushi Choudhary
* Regd No: 24E103A30
* Section: 24E1B2
* Branch: CSE
*/
import java.util.*;
public class HQ1 {

   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int a,b,c;
       System.out.print("Enter the three numbers: ");
       a=in.nextInt();
       b=in.nextInt();
       c=in.nextInt();
       boolean check=false;
      if((a+b)==c)
      check=true;
      else if((b-c)==a)
      check=true;
      else if((a*b)==c)
      check=true;
       if(check)
      System.out.println("They can be used in a correct arithmetic formula");	
      else
      System.out.println("They cant be used in a correct arithmetic formula");	
    }
}		
       