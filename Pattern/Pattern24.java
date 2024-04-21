class Pattern24
{
	public static void main(String[] args)
	{
		int num=10;
		int n=4;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				/*System.out.print(num+" ");
				num--; Not working*/
				if(i==j ||i<j)
				{
					System.out.print(num+" ");
					num--;
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
Using if
10 9 8 7
  6 5 4
    3 2
      1

*/
