import java.util.Scanner;
class CharCoversion 
{
	public static void main(String[] args) 
	{
		upperCase('R');
	}
	public static void upperCase(char ch)
	{
		if(ch>='a' && ch<='z')
		{
			System.out.println("Upper To Lower is : "+(char)(ch-32));
		}
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Lower To Upper is : "+(char)(ch+32));
		}
		else
		{
			System.out.println("it is Not Alphabet!!!");
		}
	}
}
