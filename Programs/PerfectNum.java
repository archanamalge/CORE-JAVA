importjava.util.Scanner;
class PerfectNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();

		int product=1;
		int sum=0;
		int dev=1;
		while(dev<=num/2)
		{
			if(num%dev==0)
			{
				sum+=dev;
				//System.out.println(dev);
			}
			dev++;

		}
		System.out.println(sum);

		if(sum==product)
		{
			System.out.println("It is Perfect Number");
		}
		else
		{
			System.out.println("It is not Perfect Number");
		}	
	}
}

	