import java.util.Scanner;
class TimeTable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("*******Enter Your Choice For Arithmetic Operation******");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("%");
		char ip=sc.next().charAt(0);

		switch(ip)
		{
			case '+':
			{
				System.out.println("Enter first number : ");
				double ip1=sc.nextDouble();

				System.out.println("Enter second number : ");
				double ip2=sc.nextDouble();

				System.out.println("In what type of value you want For Addition");
				System.out.println("1:Whole Number : ");
				System.out.println("2:Decimal Number");
		
				switch(sc.nextInt())
				{
					case 1:
					{
						System.out.println("The Whole Number Addition is :"+(int)(ip1+ip2));
						break;		
					}	
					case 2:
					{
						System.out.println("The Decimal Number Addition is :"+(ip1+ip2));
						break;	
					}		

				 }
				break;
			}

			case '-':
			{
				System.out.println("Enter first number : ");
				double ip1=sc.nextInt();

				System.out.println("Enter second number : ");
				double ip2=sc.nextInt();

				System.out.println("In what type of value you want For Substraction");
				System.out.println("1:Whole Number : ");
				System.out.println("2:Decimal Number : ");
		
				switch(sc.nextInt())
				{
					case 1:
					{
						System.out.println("The Whole Number Subtraction is :"+(int)(ip1-ip2));
						break;		
					}	
					case 2:
					{
						System.out.println("The Decimal Number Subtraction is :"+(ip1-ip2));
						break;	
					}		

				}
				break;
	
			}
			case'*':
			{
				System.out.println("Enter first number : ");
				float ip1=sc.nextFloat();

				System.out.println("Enter second number : ");
				float ip2=sc.nextFloat();

				System.out.println("The Multiplication is :"+(ip1*ip2));
				float mul=sc.nextFloat();	

	
				switch(sc.nextInt())
				{
					case 1:
					{
						System.out.println("The Whole Number Multiplication is :"+(int)(ip1*ip2));
						break;		
					}	
					case 2:
					{
						System.out.println("The Decimal Number Multiplication is :"+(ip1*ip2));
						break;	
					}		

				 }
				break;
			}
			case '/':
			{
				System.out.println("Enter first number : ");
				float ip1=sc.nextFloat();

				System.out.println("Enter second number : ");
				float ip2=sc.nextFloat();

				System.out.println("The Division is :"+(ip1/ip2));
				float div=sc.nextFloat();
				break;	

			}
			case '%':
			{
				System.out.println("Enter first number : ");
				float ip1=sc.nextFloat();

				System.out.println("Enter second number : ");
				float ip2=sc.nextFloat();

				System.out.println("The Modulas is :"+(ip1%ip2));
				float mod=sc.nextFloat();	
				break;
			}

			default:
			{
				System.out.println("Enter valid input");
			}
		}
	}
}

	
	
	
	
	