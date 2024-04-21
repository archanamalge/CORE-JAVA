class PrimeFactor 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	public static void primeF(int num)
	{
		int den=2;
		for (int i=0;i<num ;i++ )
		{
			if(num%i==0)  
			{
				System.out.println(num);
			}
		}
	}
}
