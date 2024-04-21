class Pattern31
{
	public static void main(String[] args)
	{
		int n=4;
		int even=7;
		int odd=1;
		int ans=1;

		for(int i=1;i<=n;i++)
		{
			ans=i;
			System.out.print(ans+" ");
			for(int j=1;j<n;j++)
			{
				if(j%2==0)
				{
					ans+=odd;
					System.out.print(ans+" ");
				}
				else
				{
					ans+=even;
					System.out.print(ans+" ");
				}
	
			}
			System.out.println();
			odd+=2;
			even-=2;
		}
	}
}

			
