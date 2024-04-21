class RangeOfPrime
{
	public static void main(String[] args)
	{
		int start=10;
		int end=50;
		int den=2;

	
		while(start<=end)
		{
			while(den<=start)
			{
				if(start%den==0)
				{
					break;
				}
				den++;
			}
			start++;
		}
		
			if(start==den)
			{
				System.out.println(start);
				//break;
			}
			
		
	}
}

			
				
		
		