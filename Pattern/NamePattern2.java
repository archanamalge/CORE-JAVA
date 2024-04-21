class NamePattern2
{
	public static void main(String[] args)
	{
		int n1=4;
		int n2=3;
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(j==0 || i==0|| i==1 && j==2 || i==2 && j==1 ||i==3 && j==2)
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
