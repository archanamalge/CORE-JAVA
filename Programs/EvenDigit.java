class EvenDigit
{
	public static void main(String[] args)
	{
		int num=1234;
		
		while(num>0)
		{
			int last=num%10;
			if(last%2==0)
			{
				System.out.println("Even Number Are :"+last);
			}
			num/=10;
		}
	}
}
