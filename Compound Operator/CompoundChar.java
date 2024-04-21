class CompoundChar
{
	public static void main(String[] args)
	{
		char ch='a';
		char ch1=(char) (ch+10);
		System.out.println(ch1);

		ch+=9;
		System.out.println(ch);
	}
}