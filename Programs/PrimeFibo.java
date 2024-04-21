import java.util.Scanner;
class PrimeFibo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nth Number : ");
		int nth=sc.nextInt();

		int n1=0;
		int n2=1;
		int n3;
		int den=2;
		for(int i=0;i<nth;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println("The n1 is "+n1);

		//System.out.println("It is Prime")
		while(den<=nth)
		{
			if(nth%den==0)
			{
				break;
			}
			den++;
		}
		System.out.println("The nth is "+nth);
		System.out.println("The den is "+den);

		if(den==nth)
		{
			System.out.println("It is Fibonacci Prime Number");
		}
		else
		{
			System.out.println("It is Not Fibonacci Prime Number");
		}
	}
}
