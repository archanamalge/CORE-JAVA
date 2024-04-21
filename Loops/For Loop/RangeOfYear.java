import java.util.Scanner;
class RangeOfYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Year :");
		int start=sc.nextInt();

		System.out.println("Enter the Ending Year :");
		int end=sc.nextInt();

		if(start>1582)
		{
			for(int i=start;i<end;i++)
			{
				if((i%400==0 && i%100!=0)||(i%4==0))
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Inavlid Input");
		}
	}
}

				