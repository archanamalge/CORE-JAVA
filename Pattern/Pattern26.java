class Pattern26
{
	public static void main(String[] args)
	{
		int n=4;
		
		for(int i=0;i<n;i++)
		{
			int num=1;

			for(int j=0;j<n;j++)
			{
				System.out.print((num+i)+" ");
				num+=n;
			}
			System.out.println();
		}
	}
}

/*

1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16

*/