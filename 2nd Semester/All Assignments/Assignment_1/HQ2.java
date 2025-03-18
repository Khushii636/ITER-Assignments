/*Write a Java program that takes all the lines input to standard input and writes them to 
standard output in reverse order. That is, each line is output in the correct order, but the 
ordering of the lines is reversed. 
* Author: Khushi Choudhary
* Regd No: 24E103A30
* Section: 24E1B2
* Branch: CSE
*/
import java.util.*;
public class HQ2 {

   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       ArrayList<String> lines = new ArrayList<>();
        
        while (in.hasNextLine()) {
            lines.add(in.nextLine());
        }
        
        in.close();
        
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}	
       