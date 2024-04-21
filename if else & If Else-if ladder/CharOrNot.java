import java.util.Scanner;
class CharOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Character : ");
		char ch=sc.next().charAt(0);

		if(ch>='a' || ch<='z')
		{
			System.out.println("It is a LowerCase alphabet");
		}
		else if(ch>='A' || ch<='Z')
		{
			System.out.println("It is Uppercase alphabet");
		}
		else if(ch>='0' || ch<='9')
		{
			System.out.println("It is Digit");
		}
		else
		{
			System.out.println("It is Special Character");
		}
	}
}


		

		