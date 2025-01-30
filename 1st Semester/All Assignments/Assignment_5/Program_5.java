/*WAP to display the multiplication table from 2 to 15.
 * Sample run:
        Multiplication table of 2
        2 × 1 = 2
        2 × 2 = 4
        :
        :
        2 × 10 = 20
        Multiplication table of 3
        3 × 1 = 3
        3 × 2 = 6
        :
        :
        3 × 10 = 30
        :
        :
        :
        Multiplication table of 15
        15 × 1 = 15
        15 × 2 = 30
        :
        :
        15 × 10 = 150
 */
package Assignment_5;
public class Program_5 {

	public static void main(String[] args) {
		for(int i=2;i<=15;i++)
		{
			System.out.println("Multiplication table of "+i);
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" x "+j+" = "+i*j);
			}
			
		}
		
    }
}

