/*The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations. It is computed by 
 *taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters. i.e.
  Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/height*height(m*m)
Write a java program by using conditional statement to show the category for a given BMI.
Category                BMI
Less than 18.5        Underweight
18.5 to 24.9         Normal Weight
25.0 to 29.9           Overweight
30.0 or more            Obese

Sample Run-1:
Enter person Weight in kg: 68
Enter height of person in meter: 2
The person is Underweight.

Sample Run-2:
Enter person Weight in kg: 96
Enter height of person in meter: 1.4
The person is Obese
 */
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double w,h,BMI;
		System.out.print("Enter person Weight in kg: ");
		w=in.nextDouble();
		System.out.print("Enter height of person in meter: ");
		h=in.nextDouble();
		BMI=w/(h*h);
		if(BMI < 18.5)
			System.out.println("UNDERWEIGHT");
		else if(BMI >= 18.5 && BMI <= 24.9)
			System.out.println("NORMAL WEIGHT");
		else if(BMI >= 25.0 && BMI <= 29.9)
			System.out.println("OVERWEIGHT");
		else 
           System.out.println("OBESE");
}
}