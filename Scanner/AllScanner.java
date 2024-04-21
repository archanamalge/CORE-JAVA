import java.util.Scanner;
class AllScanner
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number for Addition");
		int First=sc.nextInt();

		System.out.println("Enter the Second Number For Addition");
		int Second=sc.nextInt();

		int ans=First+Second;
		System.out.println("The Addition is : "+ans);

		System.out.println("Enter the Byte Value Between -128 to 127 :");
		byte b=sc.nextByte();
		System.out.println("The Value is :"+b);

		System.out.println("Enter the Short value Between -32768 to 32767 :");
		short s=sc.nextShort();
		System.out.println("The Short Value is : "+s);

		System.out.println("Enter the Long Value ");
		long l1=sc.nextLong();
		System.out.println("The Long Value is : "+l1);

		System.out.println("Enter the Float Value ");
		float f=sc.nextFloat();
		System.out.println("The Float Value is : "+f);

		System.out.println("Enter the Character ");
		char ch=sc.next().charAt(0);
		System.out.println("The Character is : "+ch);

		System.out.println("Enter the String : ");
		String s1=sc.next();
		String s2=sc.nextLine();
		System.out.println("The First String is : "+s1);
		System.out.println("The Second String is : "+s2);

		System.out.println("Enter the String to next line :");
		String s3=sc.nextLine();
		System.out.println("The NextLine String : "+s3);

	}
}

		