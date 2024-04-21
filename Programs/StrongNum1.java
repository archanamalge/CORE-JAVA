class StrongNum1
{
	public static void main(String[] args)
	{
		int n= 123;
		int sum=0;

		for(int ip=n;ip!=0;ip/=10)
		{
			int last=ip%10;
			int fact=1;

			for(int i=last;i>0;i--) 
			{
				fact*=i;
			}
			sum+=fact;		
		}
		System.out.println("The sum is: "+sum);
		if(sum==n)
		{
			System.out.println("It is Strong Num");
		}
	


	}
}
