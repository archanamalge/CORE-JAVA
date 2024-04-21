class BasicOperation 
{
	public static void main(String[] args) 
	{
		add(748,21);
		add(2,3);
		sub(493,234);
		divide(10,20);
		mul(10,10);
		pow(3,4);
	}
	public static void add(int a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
	public static void sub(int a,int b)
	{
		System.out.println("The Subtraction is : "+(a-b));
	}
	public static void divide(int a,int b)
	{
		System.out.println("The Division is : "+(a/b));
	}
	public static void mul(int a,int b)
	{
		System.out.println("The Multiplication is : "+(a*b));
	}
	public static void pow(int base,int raise)
	{
		//int base=3,raise=4;
		int pow=1;
		for(int i=0;i<=raise;i++)
		{
			pow*=base;
		}
		System.out.println("The Power is : "+pow);
	}
}
