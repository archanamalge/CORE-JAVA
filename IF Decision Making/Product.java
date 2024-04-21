import java.util.Scanner;
class Product
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Have you purchased any product ??");
		boolean ip=sc.nextBoolean();

		if(ip)
		{
			System.out.println("Please Pay the Bill");
		}
		System.out.println("Thank You");
	}
}
