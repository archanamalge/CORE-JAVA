import java.util.Scanner;
class RotateNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		System.out.println(rotate(num));
		while(num>0)
		{
			int last=num%10;
			num/=10;
		}
	}
	public static int rotate(int num)
	{
		int ct=count(num);
		return (num%10)*power(10,ct)+(num/=10);
	}
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public static int power(int last,int count)
	{
		int pow=1;
		for(int i=1;i<count;i++)
		{
			pow*=last;
		}
		return pow;
	}
}