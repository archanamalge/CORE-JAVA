class SquareDigit
{
	public static void main(String[] args) 
	{
		Extract();
		sq();
		sumSq();
	}
	public static void Extract()
	{
		int sq=0;
		int num=1234;
		while(num!=0)
		{
			int last=num%10;
			sq=last*last;
			System.out.print(sq+",");
			num/=10;
		}
			
	}
	public static 
	public static void sq()
	{
		int num=9;
		System.out.println("The Square Num is: "+(num*num));
	}
}
