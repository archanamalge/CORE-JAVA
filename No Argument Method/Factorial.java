class  Factorial
{
	public static void main(String[] args) 
	{
		facto();
	}
	public static void facto()
	{
		int num=5;
		int product=1;
		int sum=0;
		int i;
		for(i=num;i>0;i--)
		{
			product*=i;
			//System.out.println(i);
		}
		//sum+=product;
		System.out.println(product);
	}
}
