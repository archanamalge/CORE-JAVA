class Pattern18
{
	public static void main(String[] args)
	{
		char ch='j';
		int n=4;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(ch+" ");
				ch--;
				/*if(i==0|| j==0 || i+j==n-1 )
				{
					System.out.print(ch+" ");
					ch--;
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

j i h g
f e d
c b
a

*/
				
					