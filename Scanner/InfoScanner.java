import java.util.Scanner;
class InfoScanner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Name : ");
		String name=sc.nextLine();
		System.out.println("The name is : "+name);

		System.out.println("Enter the Address : ");
		String address=sc.nextLine();
		System.out.println("The Address is : "+address);

		System.out.println("Enter the Birth Date");
		int birth_Date=sc.nextInt();
		System.out.println("The Birth Date is : "+birth_Date);

		System.out.println("Enter the Age : ");
		int age=sc.nextInt();
		System.out.println("The age is : "+age);

		System.out.println("Enter the Mobile Number : ");
		long mobile_number=sc.nextLong();
		System.out.println("The Mobile Number is : "+mobile_number);

	}
}
