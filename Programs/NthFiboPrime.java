import java.util.Scanner;
class NthFiboPrime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N^th Number : ");
		int nth=sc.nextInt();
	
		int n1=0,n2=1,n3,i,den=2;
		for(i=0;i<nth;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;

		}
		
		if(n1==nth)
		{
			while(den<=n1)
			{
				if(n1%den==0)
				{
					break;
				}	
				den++;
			}		
			if(n1==den)
			{
				System.out.println("It is Fibonacci Prime Number");

			}
			else
			{
			System.out.println("It is not Fibonacci Prime Number");
			}
	
		}	
		else
		{
			System.out.println("It is Not a Fibo");
		}		
		
	}
}
