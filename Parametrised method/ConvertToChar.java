class ConvertToChar 
{
	public static void main(String[] args) 
	{
		convertTochar(50+50);
		convertTochar(200/2);
		convertTochar(98);
		convertTochar('A');


		convertToInt('b');
		convertToInt('Z');
		convertToInt('R');
	}
	public static void convertTochar(int num)
	{
		if(num>=0 && num<=127)
		{
			System.out.println((char)num);
		}
		else
		{
			System.out.println("It can not be converted!!!!");
		}
	}
	public static void convertToInt(char ch)
	{
		if(ch>=0 && ch<=127)
		{
			System.out.println((int)ch);
		}
		else
		{
			System.out.println("Invalid!!!");
		}
	}
}
