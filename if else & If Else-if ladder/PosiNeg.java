import java.util.Scanner;
class PosiNeg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num=sc.nextInt();

		if(num>0)
		{
			System.out.println("The Given Number is Positive");
		}
		else if(num==0)
		{
			System.out.println("The Given Number is Neither Positive Nor Negative");
		}
		else if(num<0)
		{
			System.out.println("The Given Number is Negative");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}

		