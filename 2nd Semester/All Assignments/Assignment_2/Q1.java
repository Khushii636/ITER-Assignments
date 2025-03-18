/*
             

 */
import java.util.*;

class carDetails
{
	String model;
	int year;
	void setDetails(String mod,int yr)
	{
		model=mod;
		year=yr;
	}
	void displayDetails(String carNumber)
	{
		System.out.print(carNumber+" information->");
		System.out.print("Model: "+model+" Year: "+year);
	}
}

public class Q1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		carDetails car1=new carDetails();
		car1.model = "Toyota";
		car1.year=2020;
		car1.displayDetails("Car1");
		
		carDetails car2=new carDetails();
		System.out.print("\nEnter the details of 2nd car ");
		String m=in.next();
	    int y=in.nextInt();
	    car2.setDetails(m, y);
		car2.displayDetails("Car2");
		
		carDetails car3=car2;
		System.out.print("\nCar3 information->");
		System.out.print("Model: "+car3.model+" Year: "+car3.year);
		
}
}		
		