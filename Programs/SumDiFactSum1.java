class SumDiFactSum
{
	public static void main(String[] args)
	{
		int fact=1;
		int num=1234;
		int sum=0;

		for(int ip=num;ip<num;ip++)
		{
			int last =ip%10;
			for(int i=last;i>0;i--)
			{
				sum+=last;
				fact*=sum;
			}
		}
		System.out.println(fact);
	}
}
