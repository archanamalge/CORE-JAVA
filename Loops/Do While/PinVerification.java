import java.util.Scanner;
class PinVerification
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int savedPin=1234;
		int attempt=0;

		do
		{
			System.out.println("Entert Your Pin:");
			int pin =sc.nextInt();

			if(savedPin==pin)
			{
				System.out.println("Login Success!!!");
				break;
			}
			attempt++;
			if(attempt<3)
		 	{
				System.out.println("Incorrect Pin! Please Try Again");
				System.out.println("Reaming Attempts Are : "+(3-attempt));
		 	}
		 }
		 while(attempt<3);

		 if(attempt==3)
		 {
			 System.out.println("Maximum Attempts Reached !!!");
		 }
	 }
}

