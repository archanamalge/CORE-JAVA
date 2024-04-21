import java.util.Scanner;
class HotelMang
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("***********************************************************");
		System.out.println("*						          *");
		System.out.println("*                Wel-Come To Unique Hotel		  *");
		System.out.println("*						          *");
		System.out.println("***********************************************************");


		System.out.println("|| 1.Vegitarian ||");
		System.out.println("|| 2.Non-Vegitarian ||");
		int ip=sc.nextInt();

		switch(ip)
		{
			case 1:
			{
				System.out.println("+++++++++1.Choose the Our Special Menu For Vegiatarian Dishesh++++++++");
				System.out.println("+++++++++2.Choose the Our Special Menu For Non-Vegitarian Dishesh+++++++++");
				
				switch(sc.nextInt())
				{
					
					case 1:
					{
						int misalPav=60;
						int vadaPav=50;
						int vade=120;
						int purnPoli=140;
						System.out.println("1.Special Misal Pav----------60");
						System.out.println("2.Special Vadapav------------50");
						System.out.println("3.Alluche Vade---------------120");
						System.out.println("4.Purn Poli------------------140");
				
						switch(sc.nextInt())
						{
							case 1:
							{
								
								System.out.println("Enter the Your First Order Quantity : ");
								int q=sc.nextInt();
								System.out.println("Total Amount of Misal Pav is : "+(misalPav*q));
								//break;
							}
							case 2:
							{
								
								System.out.println("Enter the Your Second Order Quantity : ");
								int q=sc.nextInt();
								System.out.println("Total Amount of Vada Pav is : "+(vadaPav*q));
								//break;
							}
							case 3:
							{
								
								System.out.println("Enter the Your Third Order Quantity : ");
								int q=sc.nextInt();
								System.out.println("Total Amount of Alluche Vade Pav is : "+(vade*q));
								//break;
							}
							case 4:
							{
								
								System.out.println("Enter the Your Fourth Order Quantity : ");
								int q=sc.nextInt();
								System.out.println("Total Amount of Purn Poli Pav is : "+(purnPoli*q));
								//break;
							}
							default:
							{
								System.out.println("Thank You");	
								break;
							}
						}
				       }
					
				 }
				break;
			   }
			
						
				case 2:
				{
					int chikFry=60;
					int chikl=50;
					int chikSpe=120;
					int chikNud=140;
					System.out.println("1.Special Chicken Fry----------60");
					System.out.println("2.Chieckn Lolipop--------------50");
					System.out.println("3.Chickn 65--------------------120");
					System.out.println("4.Chicken Noodles--------------140");
				
			

					switch(sc.nextInt())
					{
						case 1:
						{
							System.out.println("Enter the Your First Order Quantity : ");
							int q=sc.nextInt();
							System.out.println("Total Amount of Chicken Fry is : "+(chikFry*q));
						}
						case 2:
						{
							System.out.println("Enter the Your Second Order Quantity: ");
							int q=sc.nextInt();
							System.out.println("Total Amount of Chicken is : "+(chikl*q));
						}
						case 3:
						{
							System.out.println("Enter the Your Third Order Quantity : ");
							int q=sc.nextInt();
							System.out.println("Total Amount of Chicken 65 is : "+(chikSpe*q));
						}
						case 4:
						{
							System.out.println("\nEnter the Your Fourth Order Quantity : ");
							int q=sc.nextInt();
							System.out.println("Total Amount of Chicken Noodles is : "+(chikNud*q));
							
						}
						default :
						{
							System.out.println("Thank You");
						}
	
					}
			
				}
				defalut : 
				{
					System.out.println("Thank You");
				}
		}
	}
}

			
		




									
						
		