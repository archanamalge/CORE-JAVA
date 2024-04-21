import java.util.Scanner;
class PronicNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pronic Number : ");
		int num=sc.nextInt();
		int product=0;

		int ans=0;
		int i;

		for(i=1;i<=num;i++)
		{
			if(i+(i*1)==num)
			{
				ans=1;
				break;
			}
		}
		if(ans==1 || num==0)
		{
			System.out.println("It is Pronic Number");
		}
		else
		{
			System.out.println("It is Not a Pronic Number");
		}


	}
}