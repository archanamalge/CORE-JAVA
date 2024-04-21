class Disarium 
{
	public static void main(String[] args) 
	{
		int num=135;
		System.out.println(isDisarium(num));
		//System.out.println(count(num));
	}
	public static boolean isDisarium(int num)
	{
		int ct=count(num);
		int sum=0;

		for(int i=num; i>0; i/=10)
		{
			int rem=i%10;
			sum=sum+power(rem,ct);
		}
		System.out.println(sum);
		ct--;
		return sum==num;
	}
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;

		}
		return count;
	}
	public static int power(int rem,int count)
	{
		int pow=1;
		for(int i=count;i>0;i--)
		{
			pow*=rem;
		}
		return pow;
	}
}
