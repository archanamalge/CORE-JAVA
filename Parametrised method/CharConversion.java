import java.util.Scanner;
class CharCoversion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(Systm.in);
		System.out.println("Enter the Character : ");
		char ch=sc.nextLine();
	}
	public static void upperCase()
	{
		if(ch>=65 && ch<=98)
		{
			System.out.println("Upper To Lower is : "+(char)(ch+32));
		}
	}
}
