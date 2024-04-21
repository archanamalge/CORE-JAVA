class PalindromicEven 
{
	public static void main(String[] args) 
	{
		int ip=23632;
		int num=ip;
		//int rev =0;
		
		int ans=reverse(ip);

		if(checkPalin(ip,ans)&&checkPalinEven(ip))
		{
			System.out.println("It is Palindrome Even");
		}
		else
		{
			System.out.println("it is Not Palindrome Even");
		}

	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	public static boolean checkPalin(int rev,int ip)
	{
		return rev==ip;
	}
	public static boolean checkPalinEven(int num)
	{
		return num%2==0;
	}
	
}
