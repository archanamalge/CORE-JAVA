import java.util.Scanner;
class Fibonacci1
{
	public static void main(String[] args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nth Number : ");
		int nth=sc.nextInt();*/

		int n1=0;
		int n2=1;
		int n3;

		for(int i=0;i<=8;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println("The Fibonacci Series Number is : "+n1);
		/*if(n1<=nth)
		{
			while(den<=n1)
			{
				if(n1%den==0)
				{
					break;
				}
				den++;
			}
			System.out.println("The nth is "+nth);
			System.out.println("The den is "+den);

	
			if(den==n1)
			{
				System.out.println("It is Fibonacci Prime Number");
			}
			else
			{
				System.out.println("It is Not Fibonacci Prime Number");
			}
		}
		else
		{
			System.out.println("It Not a Fibo Prime Number");
		}*/
	}
}

 