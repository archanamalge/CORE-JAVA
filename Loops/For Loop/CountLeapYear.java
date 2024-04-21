import java.util.Scanner;
class CountLeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Year :");
		int start=sc.nextInt();
		
		System.out.println("Enter the Ending Year :");
		int end=sc.nextInt();

		int count=0;

		for(int i=start;i<end;i++)
		{
			if((i%400==0 && i%100!=0) || (i%4==0))
			{
				count++;
			}
		}
		System.out.println("The Total Count Of Year Between "+start + " to " +end+ " is :" +count);

	}
}

				
		