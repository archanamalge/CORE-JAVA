import java.util.Scanner;
class CheckIf
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you Paid Student or not : ");
		boolean ip=sc.nextBoolean();

		if(ip)
		{
			System.out.println("Pay the Fess"+3650.0);
		}
		System.out.println("Attend the Class");
	}
}
		
		