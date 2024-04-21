class Pattern17
{
	public static void main(String[] args)
	{
		char ch='a';
		int n=4;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
				
				/*if(j==0 || i==j || i==n-1 || j==n+1 )
				{
					System.out.print(ch+" ");
					ch++;	
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

a
b c
d e f
g h i j


&& Using if Cndition

a
b c
d   e
f g h i


*/