class Power
{
	public static void  main(String[] args)
	{
		int base =2;
		int raise=10;
		int pow=1;
	
		for(int i=0;i<raise;i++)
		{
			pow*=base;
		}
		System.out.println(base+" raised to "+raise+" times will be "+ pow);
	}
}
