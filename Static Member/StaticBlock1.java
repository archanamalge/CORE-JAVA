class StaticBlock1 
{
	static
	{
		System.out.println("From Static Block1");
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main Method");
	}
	static
	{
		System.out.println("From Static Block2");
	}
}
