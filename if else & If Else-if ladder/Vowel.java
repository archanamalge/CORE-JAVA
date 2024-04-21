import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		char ch=sc.next().charAt(0);

		switch(ch)
		{
			case 'a':
			case 'i':
			case 'o':
			case 'e':
			case 'u':
			{
				System.out.println("It is Vowe!!!");
			}
			break;
			default :
			{
				System.out.println("It is Consonant!!!");
			}
		}
	}
}

			