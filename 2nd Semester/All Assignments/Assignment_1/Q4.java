/*Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r' exactly once.
Example:
For 3 characters ‘C’, ‘A’, ‘R’, the possible strings are
CAR
CRA
RCA
RAC
ACR
ARC
 */
public class Q4 {

	public static void main(String[] args) {
		char[] arr= {'c','a','r'};
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				for(int k=0;k<=2;k++)
				{
					if(i!=j && j!=k && k!=i)
					{
						System.out.println(arr[i]+""+arr[j]+""+arr[k]);
					}
				}
			}
		}
}
}