class DivFact
{
	public static void main(String[] args)
	{
		int num=100;
		int dev=1;
		while(dev<=num/2)
		{
			if(num%dev==0)
			{
				System.out.println(dev);
			}
			dev++;
		}
	}
}