import java.util.Scanner;
class CountEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();

		int even=0;
		int odd=0;
		int count=0;

		while(num>0)
		{
			int last=num%10;
			if(last%2==0)
			{
				even++;
			}
			else if(last%2!=0)
			{
				odd++;
			}
			num/=10;
		}
		System.out.println("The Even Numbers Are : "+even);
		System.out.println("The odd Numbers Are : "+odd);

	}
}

		