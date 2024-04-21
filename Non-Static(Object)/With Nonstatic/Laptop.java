class Laptop 
{
	static String OS;
	static double screen;
	static String shape;
	static int RAM;

	public static void main(String[] args)
	{
		os();
		screen();
		shape();
		ram();

		display();
	}
	public static void os()
	{
		System.out.println("From OS() : "+OS);
	}
	public static void screen()
	{
		System.out.println("From Screen() : "+screen);
	}
	public static void shape()
	{
		System.out.println("From Shape() : "+shape);
	}
	public static void ram()
	{
		System.out.println("From RAM() : "+RAM);
	}
	public static void display()
	{
		System.out.println("----------------------");
		System.out.println("From Display()");
		System.out.println(OS);
		System.out.println(screen);
		System.out.println(shape);
		System.out.println(RAM);
	}
}
