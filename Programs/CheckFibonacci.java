import java.util.Scanner;
class CheckFibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3;

		for(;;)
		{

			if(n1==num)
			{
				System.out.println("It is Fibonacci Number");
				break;
			}
			else if(n1>num)
			{
				System.out.println("It is Not Fibonacci Number");
				break;
			}
			else
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		}
	}
}


		
		