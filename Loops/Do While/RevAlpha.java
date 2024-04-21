class RevAlpha
{
	public static void main(String[] args)
	{
		char start='Z';
		char end='A';

		do
		{
			System.out.println(start);
			--start;
			
		}
		while(start>=end);
	}
}