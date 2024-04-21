class LargestThree
{
	public static void main(String[] args)
	{
		int num1=20;
		int num2=30;
		int num3=40;

		boolean ans=(num1>num2 && num1>num3);
		boolean ans1=(num1>num2 || num1<num3);
		boolean ans2=(!(num1>num2 && num1>num3));
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}
}

		