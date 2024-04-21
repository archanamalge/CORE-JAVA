class CountDigit 
{
	public static void main(String[] args) 
	{
		countDigit();
	}
	public static void countDigit()
	{
		int num=1234566;
		int count=0;

		while(num!=0)
		{
			int last=num%10;
			num/=10;
			count++;
		}
		System.out.println(count);
	}

}
