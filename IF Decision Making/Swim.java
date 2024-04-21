import java.util.Scanner;
class Swim
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you not able to Swim");
		boolean ip=sc.nextBoolean();

		if(ip)
		{
			System.out.println("Learn Swim");
		}
		System.out.println("Swim");
	}
}

