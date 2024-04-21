class Pailndrome
{
	public static void main(String[] args)
	{
		int num=1221;
		int rev=0;

		while(num>0)
		{
			int last=num%10;
			rev=rev*10+last;
			num/=10;
		}
		if(num==rev)
		{
			System.out.println("It is Reverse Number : "+rev);
		}
		else
		{
			System.out.println("It is not Reverse Number ");
		}
	}
}
