class MobileDriver
{
	public static void main(String[] args) 
	{
		Mobile m1=new Mobile();
		m1.screen=12.5;
		m1.shape="Square";
		m1.camera=389.07;
		m1.RAM=8;
		m1.OS="Android";
		m1.SIM=1;
		System.out.println("--------------------------------");
		System.out.println("Refernace is : "+m1);
		System.out.println("Screen is : "+m1.screen);
		System.out.println("Shape is : "+m1.shape);
		System.out.println("RAM is : "+m1.RAM + "GB");
		System.out.println("Camera is : "+m1.camera);
		System.out.println("OS is : "+m1.OS);
		System.out.println("SIM is : "+m1.SIM);
		
		System.out.println("--------------------------------");


		Mobile m2=new Mobile();
		System.out.println("Refernace is : "+m2);
		System.out.println("Screen is : "+m2.screen);
		System.out.println("Shape is : "+m2.shape);
		System.out.println("RAM is : "+m2.RAM + "GB");
		System.out.println("Camera is : "+m2.camera);
		System.out.println("OS is : "+m2.OS);
		System.out.println("SIM is : "+m2.SIM);
		System.out.println("--------------------------------");
	}
}
