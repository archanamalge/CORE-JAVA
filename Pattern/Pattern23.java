class Pattern23
{
	public static void main(String[] args)
	{
		int num=10;
		int n=4;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(num+" ");
				num--;
				/*if(i==0|| j==0 || i+j==n-1 )
				{
					System.out.print(num+" ");
					num--;
				}
				else
				{
					System.out.print(" "+" ");
				}*/
			}
			System.out.println();
		}
	}
}

/*

10 9 8 7
6 5 4
3 2
1

or Using if condition

10 9 8 7
6   5
4 3
2

*/
	