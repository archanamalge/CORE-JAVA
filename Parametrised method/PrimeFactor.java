import java.util.Scanner;
class PrimeFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();

		//System.out.println(factor(num));

		int den=2;
		int fac=factor(num);
		while(den<=num)
		{
			if(factor(num))
			{
				if(fac%den==0)
				{
					System.out.println(den);
				}
			}
			den++;
		}

	}
	public static boolean factor(int num)
	{
		int i=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
		return true;
	}
}