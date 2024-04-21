class Bottle 
{
	static String brand;
	static double price;
	static String type;
	static String color;
	static String shape;
	static double cap;

	public static void main(String[] args)
	{
		brand();
		price();
		type();
		color();
		shape();
		cap();

		display();
	}
	public static void brand()
	{
		System.out.println("From Brand() : "+brand);
	}
	public static void price()
	{
		System.out.println("From Price() : "+price);
	}
	public static void type()
	{
		System.out.println("From Type() : "+type);
	}
	public static void color()
	{
		System.out.println("From Color() : "+color);
	}
	public static void shape()
	{
		System.out.println("From Shape()"+shape);
	}
	public static void cap()
	{
		System.out.println("From Cap() : "+cap);
	}
	public static void display()
	{
		System.out.println("---------------------------");
		System.out.println("From Display()");
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
		System.out.println(color);
		System.out.println(shape);
		System.out.println(cap);
	}
}
