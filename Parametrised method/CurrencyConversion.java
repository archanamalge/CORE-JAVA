class CurrencyConversion 
{
	public static void main(String[] args) 
	{
		ruppesToDollar(100);
	}
	public static void ruppesToDollar(double rupee)
	{
		double dollar=rupee/82.92;
		System.out.println("Ruppes To Dollar is : "+(dollar));

		dollarToDihram(dollar);
	}
	public static void dollarToDihram(double dollar)
	{
		double dihram=dollar*3.67;
		System.out.println("Dollar To Dihram is : "+(dihram));

		dihramToEuro(dihram);
	}
	public static void dihramToEuro(double dihram)
	{
		double euro=dihram/4;
		System.out.println("Dihram To Euro is : "+(euro));
	}
}
