import java.util.Scanner;
class EvenLeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year=sc.nextInt();

		for(int i=year;i<5000;i++)
		{
			if((i%4==0 && i%100!=0) && (i%2==0))
			{
				System.out.println(i);
			}
		}
	}
}

				
			
			