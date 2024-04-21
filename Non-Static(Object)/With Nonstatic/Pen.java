class Pen 
{
	static String material;
	static String  ink;
	static String cap_ink;
	static String type;
	
	public static void main(String[] args)
	{
		System.out.println("From Main()");
		mat();
		ink();
		cap_ink();
		type();

		display();
	}

	public static void mat()
	{
		System.out.println("From Material() : "+material);
	}
	public static void ink()
	{
		System.out.println("from Ink() : "+ink);
	}
	public static void cap_ink()
	{
		System.out.println("From Cap_ik() : "+cap_ink);
	}
	public static void type()
	{
		System.out.println("From type() : "+type);
	}
	public static void display()
	{
		System.out.println("-----------------------");
		System.out.println("From Display()");
		System.out.println(material);
		System.out.println(ink);
		System.out.println(cap_ink);
		System.out.println(type);
	}
}
