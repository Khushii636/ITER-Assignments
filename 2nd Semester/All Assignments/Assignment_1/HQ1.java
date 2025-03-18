/*Write a Java program that takes as input three integers, a, b, and c, from the Java console 
and determines if they can be used in a correct arithmetic formula (in the given order), like 
“a + b = c,” “a = b − c,” or “a b = c.”∗
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
      {
        System.out.println(a+" + "+b+" = "+c);
        check=true;
      }
    if((b-c)==a)
    {
      System.out.println(a+" = "+b+" - "+c);
      check=true;
    }
      if((a*b)==c)
      {
        System.out.println(a+" * "+b+" = "+c);
        check=true;
      }
      if(!check)
      System.out.println("They cant be used in a correct arithmetic formula");	
    }
}		
       