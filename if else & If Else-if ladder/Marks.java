import java.util.Scanner;
class Marks
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your Marks : ");
		float marks=sc.nextFloat();

		if(marks<35)
		{
			System.out.println("Fail!!");
		}
		else if (marks==35)
		{
			System.out.println("Pass");
		}
		else if(marks>35 && marks<=60)
		{
			System.out.println("Second Class");
		}
		else if(marks>60 && marks<=75)
		{
			System.out.println("First Class");
		}
		else if(marks>75 && marks<=90)
		{
			System.out.println("First Class With Distinication");
		}
		else if(marks>90 && marks<=100)
		{
			System.out.println("Distinication!!!!");
		}
	}
}
			
 