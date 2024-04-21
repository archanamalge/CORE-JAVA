class Pattern22
{
	public static void main(String[] args)
	{
		int n=4;
		int num=1;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				/*System.out.print((num)+" ");
				num++;*/
				
				if(j==0 || i==j || i==n-1 || j==n+1 )
				{
					System.out.print(num+" ");
					num++;	
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


/*

1
2 3
4 5 6
7 8 9 10

1
2 3
4   5
6 7 8 9

*/