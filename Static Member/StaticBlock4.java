class StaticBlock4 
{
	static double d;
	static 
	{
		double d=123.123;
		d=test()+demo(d);  //0.0+246.246
		System.out.println(d); //246.246
	}
	public static void main(String[] args) 
	{
		System.out.println(d);
	}
	public static double test()
	{
		return d*d;   //0.0
	}
	public static double demo(double num)//246.246
	{
		d=num; //123.123
		return num+num;//246.246
	}
}
