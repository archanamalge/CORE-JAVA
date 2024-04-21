class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		demo();
		System.out.println("method End");
	}
	public static void demo()
	{
		System.out.println("Demo Begin");
		test();
		System.out.println("Demo End");
	}
	public static void test()
	{
		System.out.println("Test Begin");
	}
}
