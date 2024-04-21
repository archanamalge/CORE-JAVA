class SumDiFactSum
{
	public static void main(String[] args)
	{
		int num=1234;
		int sum=0;
		int last=0;
		int fact=1;

		while(num!=0)
		{
			last=num%10;
			sum+=last;
			num/=10;
		}
		
		System.out.println("The Normal Sum is : "+sum);
		for(int i=sum;i>0;i--)
		{
			fact*=i;
		}
		sum+=fact;
		System.out.println("Fact is : "+fact);
		System.out.println("The Fact of sum is : "+sum);

	}
}

		