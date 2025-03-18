/*
             

 */
import java.util.*;

class Complex
{
	int real;
	int imag;
	void setData(int r,int i)
	{
		real=r;
		imag=i;
	}
	void display()
	{
		if(imag<0)
			System.out.print(real+""+imag+"i");
		else if(imag==0)
			System.out.print(real);
		else
			System.out.print(real+"+"+imag+"i");
	}
	public Complex add(Complex c1,Complex c2)
	{
		Complex sum= new Complex();
		sum.real=c1.real+c2.real;
		sum.imag=c1.imag+c2.imag;
		
		return sum;
	}
	
}

public class Q2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Complex complex1=new Complex();
		System.out.print("Enter the 1st real number: ");
		int r=in.nextInt();
		System.out.print("Enter the 1st imaginary number: ");
		int i=in.nextInt();
		complex1.setData(r,i);
		complex1.display();
		
		Complex complex2=new Complex();
		System.out.print("\nEnter the 2nd real number: ");
		int r2=in.nextInt();
		System.out.print("Enter the 2nd imaginary number: ");
		int i2=in.nextInt();
		complex2.setData(r2,i2);
		complex2.display();
		
		Complex complex3=new Complex();
		complex3=complex3.add(complex1,complex2);
		System.out.print("\nThe sum of both the complex number is ");
		complex3.display();
}
}		
		