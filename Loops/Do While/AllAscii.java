class AllAscii
{
	public static void main(String[] args)
	{
		char start=0;
		char end=127;
	
		do
		{
			System.out.println(start);
			++start;
		}
		while(start<=end);
	}
}