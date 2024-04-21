
class PalindromeNum 
{
	public static void main(String[] args) 
	{
		palin();
	}
	public static void palin()
	{
		int num=555;
		//int num2=num;
		int rev=0;

		for(int i=num;i!=0;i/=10)
		{
			int last=num%10;
			rev=rev*10+last;
		}
		System.out.println("Reversev is:"+rev);

		if(num==rev)
		{
			System.out.println("It is Palindrome Number");
		}
		else
		{
			System.out.println("It is Not Palindrome Number");
		}
	
	}
}
