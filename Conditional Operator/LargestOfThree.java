class LargestOfThree
{
	public static void main(String[] args)
	{
		int num1=10;
		int num2=20;
		int num3=30;

		int ans= num1 > num2 ? num1 : num2;
		int ans1= ans > num2 ? ans : num2;
		System.out.println(ans1);

		int ans2= num1>(num2>num3?num2:num3)? num2 : num3;
		System.out.println(ans2);
	}
}
