class Pattern27
{
	public static void main(String[] args)
	{
		int n=11;

		for(int i=0;i<n;i++)
		{
			for(int j=0;i<n;j++)
			{
				if(i<=n/2)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}

					