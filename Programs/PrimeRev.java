import java.util.Scanner;
class PrimeRev
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();

		int den=2;
		int rev=0;

		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		
		if(num==den)
		{
			System.out.println("It is Prime Number");
			rev=rev*10+(num%10);

			while(den<rev)
			{
				if(rev%den==0)
				{
					break;
				}
				den++;
			}

			if(rev==den)	
			{
				System.out.println("It is Reversed Prime Number");
			}
			else
			{
				System.out.println("It is Not Reversed Prime Number");
			}
		}
		else
		{
			System.out.println("It is Not Prime");
		}
	}
}
			