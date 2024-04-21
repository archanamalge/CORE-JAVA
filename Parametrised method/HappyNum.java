class  HappyNum
{
	public static void main(String[] args) 
	{
		int num=31;
		System.out.println(SumD(31));
		System.out.println(isHappy(31));
	}


	public static int isHappy(int num)
	{
		if(SumD(num))
		{
			if(num==1 || num==4)
			{
				break;
			}
		}
		return num;
	}
	public static int SumD(int num)
	{
		int sum=0;
		int sq=0;
		while(num!=0)
		{
			int last=num%10;
			sum+=(last*last);
			num/=10;
		}
		return sum; 
	}
}
