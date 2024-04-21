import java.util.Scanner;
class SumOfPrime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();

		int den=2;
		int sum=0;

		if(den<=num)
		{
			while(num!=0)
			{
				int last=num%10;
				sum+=den;
				num/=10;
				if(sum%den==0)
				{
					break;
				}
			}
		}
		System.out.println("The Sum is : "+sum);
		if(sum%den==0)
		{

			System.out.println("It is Prime Number");
		}
		else
		{
			System.out.println("It is Not Prime Number");
		}
	}
}

			
		
			