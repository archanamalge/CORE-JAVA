import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year=sc.nextInt();

		if(year<1582)
		{
			System.out.println("The Should be Greater than 1582.According to Gregorian Calender.");
		}
		else if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("It is Leap Year !!!");
		}
		else
		{
			System.out.println("It is Not Leap Year !!!");
		}
	}
}

		