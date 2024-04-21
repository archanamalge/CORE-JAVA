class Pattern20
{
	public static void main(String[] args)
	{
		char ch='a';
		int n=4;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<n-i-1)
				//if(i==0 && j==n-1  || i+j==n-1 || j==n-1 || i==n-1)
				{
					System.out.print(" "+" ");
				}
				else
				{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}


/*

      a
    b c
  d e f
g h i j


*/