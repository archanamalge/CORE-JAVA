class RangeOfPrime2
{
	public static void main(String[] args)
	{
		int start=10;
		int end=50;
		int den=2;

		for(;start<=end;start++)
		{
			for(den=2;den<=start;den++)
			{
				if(start%den==0)
				{
					break;
				}
				//System.out.println(" ");
			}
		}
		if(start==den)
		{
			System.out.println(start);
		}
	}
}
