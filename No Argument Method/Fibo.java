class Fibo
{
	public static void main(String[] args)
	{
		fibo();
		checkFibo();

	}
	public static void checkFibo()
	{
		int n1=0,n2=1,n3;

		for(; ;)
		{
			int num=5;
			if(num==n1)
			{
				System.out.println("It is Fibo Number");
				break;
			}
			else if(n1>num)
			{
				System.out.println("It is Not Fibo Number");
			}
			else
			{
				n3=n1+n2;
				//System.out.println(n1);
				n1=n2;
				n2=n3;
			}
		}
	}
	public static void fibo()
	{
		//int num=100;
		int n1=0,n2=1,n3;

		for(int i=0;i<=100;i++)
		{
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}
}