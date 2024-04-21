import java.util.Scanner;
class SumOfProduct
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();

		int product=1;
		int sum=0;
	
		while(num>0)
		{
			int last=num%10;
			sum+=last;
			product*=last;
			num/=10;

		}
		if(sum==product)
		{
			System.out.println("It is Equal");
		}
		else
		{
			System.out.println("It is not equal");
		}
	}
}

			