class Mobile 
{
	static double screen;
	static String shape;
	static double camera;
	static String brand;
	static String OS;
	static int RAM;
	static String network;
	static int SIM;

	public static void main(String [] args)
	{
		System.out.println("Main Method Start!!!");
		screen();
		shape();
		camera();
		brand();
		os();
		ram();
		netw();
		sim();

		System.out.println("--------------------------------");
		display();

	}
	public static void screen()
	{
		System.out.println("From Screen() : "+screen);
	}
	public static void shape()
	{
		System.out.println("From Shape() : "+shape);
	}
	public static void camera()
	{
		System.out.println("From Camera() : "+camera);
	}
	public static void brand()
	{
		System.out.println("From Brand() : "+brand);
	}
	public static void os()
	{
		System.out.println("From OS() : "+OS);
	}
	public static void ram()
	{
		System.out.println("From RAM() : "+RAM);
	}
	public static void netw()
	{
		System.out.println("From Network() : "+network);
	}
	public static void sim()
	{
		System.out.println("From SIM() : "+SIM);
	}
	public static void display()
	{
		System.out.println("From Display Method");
		System.out.println(screen);
		System.out.println(shape);
		System.out.println(camera);
		System.out.println(brand);
		System.out.println(OS);
		System.out.println(RAM);
		System.out.println(network);
		System.out.println(SIM);
	}
}

