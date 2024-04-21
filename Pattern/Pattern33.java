class Pattern33
{
	public static void main(String[] args)
	{
		int n=4;

		for(int i=1;i<=n;i++)
		{
			int num=i;
			int cnt=1;
			System.out.print(num+" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=n-j;	
				cnt++;	
			}
			System.out.println();
		}
	}
}

		