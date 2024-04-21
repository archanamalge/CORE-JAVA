class Pattern25
{
	public static void main(String[] args)
	{
		int num=1;
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
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}


/*

      1
    2 3
  4 5 6
7 8 9 10

*/