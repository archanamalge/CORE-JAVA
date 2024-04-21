import java.util.Scanner;
class DuckNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		while(num>0)
		{
			int last=num%10;
			if(last==0)
			{
				break;
			}
			else if(num==0)
			{
				System.out.println("It is not a Duck Number");
			}
			else
			{
				System.out.println("It is Duck Number");	
			}	
		}
	}
}
