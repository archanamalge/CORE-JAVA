import java.util.Scanner;
class FermetNum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();

		System.out.println("Enter the Raise Value : ");
		int raise=sc.nextInt();

		fermet(num,raise);
	}
	public static void fermet(int num,int raise)
	{
		int ans=0;

		ans=(2*pow(2,raise)+1);
		System.out.println(ans);
	}
	public static int pow(int num,int raise)
	{
		int pow=1;
		for(int i=1;i<=raise;i++)
		{
			pow*=num;
		}
		System.out.println(pow);
		return pow;
	}

}
