class AlternateAlpha
{
	public static void main(String[] args)
	{
		char start='A';
		char end='Z';

		do
		{
			System.out.println(start);
			//++start;
			start+=2;

		}
		while(start<=end);
	}
}

	