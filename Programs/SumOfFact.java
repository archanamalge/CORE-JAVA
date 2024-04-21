import java.util.Scanner;
class SumOfFact
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();

		int fact=1;
		int sum=0;
		int i;

		for(i=0;i<num;i++)
		{
			fact*=num;
		}
		sum+=i;
		if(sum==num)
		{
			System.out.println("It is Perfect Number");
		}
		else
		{
			System.out.println("It is Not Perfect Number");
		}
	}
}
