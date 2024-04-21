import java.util.Scanner;
class AttendingClass
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you Late For today's Class : ");
		boolean ip=sc.nextBoolean();

		if(ip)
		{
			System.out.println("Ask Permission");
		}
		System.out.println("Attend the Class");
	}
}
