import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		primeRange();
		prime();
	}
	public static void primeRange()
	{
		int start=1;
		int end=100;
		int den=2;

		for(int i=0;i<=100;i++)
		{
			if(i%den!=0)
			{
				System.out.println(i);
			}
		}
	}
	public static void prime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt(); 
		int den=2;
		
		while(den<=num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		primeRange();
		if(den==num)
		{
			System.out.println("It is Prime Number");
		}
		else
		{
			System.out.println("It is Not Prime Number");
		}
		
	}
}
