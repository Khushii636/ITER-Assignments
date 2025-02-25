/*Write a java program to calculate the monthly electricity bill. The tariff is given as follows:
                     Price per unit    Unit range
                       Rs. 3/-          First 50 units
                       Rs. 4.80/-       50-200 units
                       Rs. 5.80/-       200-400 units
                       Rs. 6.20/-       Above 400 unit
 */
package Assignment_3;
import java.util.Scanner;
public class Program_6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int units;
		double bill=0;
		System.out.print("enter no of units: ");
		units=in.nextInt();
		if(units<=50)
			bill=units*3;
		else if(units>50 && units<=200)
			bill=(50*3)+((units-50)*4.80);
		else if(units>200 && units<=400)
			bill=(50*3)+((150)*4.80)+((units-200)*5.80);
		else if(units>400)
			bill=(50*3)+((150)*4.80)+(200*5.80)+((units-400)*6.20);
		
		System.out.println("monthly electricity bill= "+bill);
	    in.close();	
    }

}

