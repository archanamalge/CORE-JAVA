class Pattern32
{
	public static void main(String[] args)		
	{
		int n=4;
		int inc=n-1;
		int ans=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				ans=i+1;
				inc=n-i;
				if(j>=i)
				{
					ans=ans+inc;
					System.out.print(ans+" ");
					inc--;
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}
}
