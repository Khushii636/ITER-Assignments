/*From the above question no. (6) write a java program with a choice if the consumer wants to pay bill online. Consumer who pays their 
 * electricity bill online will get a discount of 3%.
                  Here is the sample output:
                      No. of units consumed: 867
                      Do you want to pay online(y/n): y
                      Total amount: 4925.4
                      Discount: 147.762
                      Amount payable: 4777.638
 * Author: Khushi Choudhary
 * Branch: CSE
 */
import java.util.Scanner;
public class PROGRAM_7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int units;
		char choice;
		double bill=0,dis=0;
		System.out.print("No. of units consumed: ");
		units=in.nextInt();
		System.out.print("Do you want to pay online(y/n): ");
		choice=in.next().charAt(0);
		if(units<=50)
			bill=units*3;
		else if(units>50 && units<=200)
			bill=(50*3)+((units-50)*4.80);
		else if(units>200 && units<=400)
			bill=(50*3)+((150)*4.80)+((units-200)*5.80);
		else if(units>400)
			bill=(50*3)+((150)*4.80)+(200*5.80)+((units-400)*6.20);
		
		System.out.println("Total amount: "+bill);
		if(choice=='y' || choice=='Y')
		{
			dis=(bill*0.03);
			bill-=(bill*0.03);
		    System.out.println("Discount: "+dis);
		    System.out.println("Amount payable: "+bill);
		    }
	}
}