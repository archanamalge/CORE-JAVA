import java.util.Scanner;
class ContainFibo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();

		int n1=0,n2=1,n3,i;
		for(i=0;i<num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		while(num!=0)
		{
			int last=num%10;
			if(last!=1 && last!=2 && last!=3 && last!=5 && last!=8 && last!=13 && last!=17)
			{
				break;
			}
			num/=10;
		}
		if(num==0)
		{
			System.out.println("It has All Contain Fibonacci Number");
		}
		else
		{
			System.out.println("It has Not All Contain Fibonacci Number");
		}
	}
}
