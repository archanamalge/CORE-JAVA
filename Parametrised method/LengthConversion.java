class LengthConversion 
{
	public static void main(String[] args) 
	{
		cmToMeter(2050);
	}
	public static void cmToMeter(double cm)
	{
		double meter=cm/100;
		System.out.println("Cm to Meter is :"+meter);

		meterKillometer(meter);
	}
	public static void meterKillometer(double meter)
	{
		double killometer=meter/1000;
		System.out.println("Meter To Killometer is :"+killometer);
	}
	
}
