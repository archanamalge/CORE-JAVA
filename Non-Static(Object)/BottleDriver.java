class BottleDriver 
{
	public static void main(String[] args) 
	{
		Bottle b1=new Bottle();
		System.out.println("---------------------------");
		System.out.println("Brand is : "+b1.brand);
		System.out.println("price is : "+b1.price);
		System.out.println("Bottle Type is : "+b1.type);
		System.out.println("Color is : "+b1.color);
		System.out.println("Capcity is : "+b1.cap);

		Bottle b2=new Bottle();
		System.out.println("---------------------------");
		b2.brand="cool";
		b2.price=99;
		b2.type="plastic";
		b2.color="Blue";
		b2.cap=500;
		System.out.println("Brand is : "+b2.brand);
		System.out.println("price is : "+b2.price);
		System.out.println("Bottle Type is : "+b2.type);
		System.out.println("Color is : "+b2.color);
		System.out.println("Capcity is : "+b2.cap);
		System.out.println("---------------------------");
	}
}
