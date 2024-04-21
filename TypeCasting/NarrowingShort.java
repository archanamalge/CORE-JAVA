class NarrowingShort
{
	public static void main(String[] args)
	{
		short s=130;
		System.out.println(s);

		short s1=(short)125;
		System.out.println(s1);
		
		short s2=(short)32455;
		System.out.println(s2);

		short s3=(short)5432678;
		System.out.println(s3);

		short s4=(short)324156790l;
		System.out.println(s4);

		short s5=(short)54.78f;
		System.out.println(s5);

		short s6=(short)786.45;
		System.out.println(s6);

		short s7=(short)'z';
		System.out.println(s7);
	}
}