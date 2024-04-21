class RangeOfPrime
{
	public static void main(String[] args)
	{
		int start=1;
		int end=100;
	
		while(start<=end)
		{
			int den=2;
			for(int i=start;i<end;i++)
			{
				if(i%den==0)
				{
					System.out.println(i);
					//break;
				}
			}
			start++;
		}
	}
}

			
				
		
		