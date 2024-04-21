import java.util.Scanner;
class CoPrime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n1 Number : ");
		int n1=sc.nextInt();
	
		System.out.println("Enter the n2 Number : ");
		int n2=sc.nextInt();

		int big=n1<n2?n1:n2;

		int den=2;

		while(true)
		{
			if(n1%den==0 || n2%den==0)
			{
				//System.out.println("It is Not Co-prime Number");
				break;
			}
			den++;
		}
		if(den==n1 || den==n2)
		{
			System.out.println("It is Co-Prime Number");
		}

		else
		{
			System.out.println("It is not Co-Prime Number");

		}
		

	}
}
