import java.util.Scanner;
class Buzz
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		int last=0;
		int num=7;
		for(int i=0;i<1;i++)
		{
			last=n%10;
			

			if(n%7==0 || last==7)
			{
				System.out.println("It is a Buzz Number");		
			}
			else
			{
				System.out.println("It is Not Buzz Number");
				break;
			
			}
		} 
	}
}
