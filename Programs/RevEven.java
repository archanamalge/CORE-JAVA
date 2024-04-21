class RevEven
{
	public static void main(String[] args)
	{
		int num=26;
		int rev=0;

		while(num>0)
		{
			int last=num%10;
			if(last%2==0)
			{
				System.out.println(last);
				rev=rev*10+last;
				num/=10;
			}
		}
		System.out.println("The Reverse Number is : "+rev);
		if(rev%2==0)
		{
			System.out.println("Twisted Reverse Number");
		}
		else
		{
			System.out.println("Not Twisted Reverse Number");
		}
			
	}
}

				