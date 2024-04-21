import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Neon Number : ");
		int num=sc.nextInt();
		int sum=0,squ=1;
		
		for(int ip=0;ip<2;ip++)
		{
			squ=squ*num;
		}
		while(squ>0)
		{
			int last=squ%10;
			sum+=last;
			num/=10;

		}
		if(sum==num)
		{
			System.out.println("It is Neon Number");
		}
		else
		{
			System.out.println("It is Not a Neon Number");
		}


	}
}