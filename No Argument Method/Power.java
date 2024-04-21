import java.util.Scanner;
class  Power
{
	public static void main(String[] args) 
	{
		pow();
	}
	public static void pow()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base Value");
		int base=sc.nextInt();

		System.out.println("Enter the Raise Value");
		int raise=sc.nextInt();

		int product=1;
		for(int i=0;i<raise;i++)
		{
			product*=base;
		}
		System.out.println("The Power value is: "+product);
	}
}
