import java.util.Scanner;
class NthFibo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N^th Number : ");
		int nth=sc.nextInt();
		
		int n1=0,n2=1,n3,i;

		for(i=0;i<nth;i++)
		{
			n3=n1+n2;
			n1=n2;
			//System.out.println(n1);

			n2=n3;
			System.out.println(n1);

		}

	}
}

	