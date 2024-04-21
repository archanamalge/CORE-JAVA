class StrongNum
{
	public static void main(String[] args)
	{
		int num=145;
		int sum=0;

		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			int fact=1;
			for(int ip=last;ip>0;ip--)
			{
				fact*=ip;
			}
			sum+=fact;

		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("It is Strong Number");
		}
		else
		{
			System.out.println("It is Not Strong Number");
		}
	}
}

		
		