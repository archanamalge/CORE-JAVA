class Prime 
{
	public static void main(String[] args) 
	{
		int num=17;
		int num2=num;
		System.out.println("Range of Prime Number Are :");
		int start=1;
		int end=100;
		while(start<=end)
		{
			if(primeCheck(start))
			{
				System.out.println(start);
			}
			start++;
		}

		System.out.println("The Given "+num+ " is prime ?? "+primeCheck(num));

		if(primeCheck(num))
		{
			int rev=reverse(num2);
			if(reverse(rev))
			{
				System.out.println(num+" is Twisted Prime Number");
			}
			else
			{
				System.out.println(num+" is Not Twisted Prime Number");
			}
		}


	}
	public static int primeCheck(int num)
	{
		int den=2;
		while(den<=num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		return den==num;

	}
	public static int reverse(int num)
	{
		int rev=0;
		int den=2;

		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;;
		}
		return rev;
	}
}
