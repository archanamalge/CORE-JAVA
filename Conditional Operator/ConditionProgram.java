class ConditionalProgram
{
	public static void main(String[] args)
	{
		int num1 =10;
		int num2=20;

		int ans = num1 > num2 ? num1 : num2;
		System.out.println("The largest of " + num1 + " and " + num2 + "is:"+ans);
	}
}
