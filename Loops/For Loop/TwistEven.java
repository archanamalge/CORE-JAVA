import java.util.Scanner;
class TwistEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();

		int rev=0;
	
		
		if(num%2==0)
		{
			while(num>0)
			{
				int last=num%10;
				rev= rev*10+last;
				num/=10;
			}
			if(rev%2==0)
			{
				System.out.println("It is Twisted Even Number "+rev);
			}
			else
			{
				System.out.println("It is Not Twisted Even Number!!!");
			}
		}
		else
		{
			System.out.println("It is Not even Number");
		}
		
	}
}