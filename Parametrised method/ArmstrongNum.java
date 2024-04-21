class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		int num=153;
		int ct=count(num);
		System.out.println(count(num));
		System.out.println(isArmstrong(num));
	}
	public static boolean isArmstrong(int num)
	{
		int ct=count(num);
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int last=num%10;
			sum=sum+power(last,ct);
			num/=10;
		}
		return sum==temp;
	}
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			//int last=num%10;
			count++;
			num/=10;
		}
		return count;
	}
	public static int power(int last,int count)
	{
	
		int pow=1;
		for(int i=0;i<count;i++)
		{
			pow*=last;

		}
			return pow;
	}
}
