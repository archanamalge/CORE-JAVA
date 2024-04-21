import java.util.Scanner;
class SumFactProduct
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		int product=1;
		int dev=1;
		int sum=0;
		int rev=0;

		while(dev<=num/2)
		{
			if(num%dev==0)
			{
				sum+=dev;


			}
			dev++;
		}

		
		System.out.println("The Product is : "+product);
		System.out.println("The Sum is : "+sum);
	
		if(sum==num)
		{
			System.out.println("It is Perfect Number");
			for(int i=0;i<num;i/=10)
			{
				int last=num%10;
				rev=rev*10+last;
			}

		
			if(rev==num)
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("It is Not Palindrome");
			}

			
		}
		else
		{
			int sumNo=0;
	
			System.out.println("It is Not a Perfect Number");
			while(num>0)
			{
				int rem=num%10;
				sumNo+=rem;
				num/=10;

			}
			System.out.println("The Sum of Digit is :"+sumNo);
			
		
		}
	}
}

		