class ATMTran
{
	static double balance;
	static int pin=1234;
	static long acc=162389361l;

	public static void main(String[] args) 
	{
		withdraw(1234,162389361l,500);
		deposite(1234,162389361l,1000);
	}
	public static void withdraw(int pin,long acc,int amt)
	{
		if(ATMTran.acc==acc && ATMTran.pin==pin && amt>0)
		{
			System.out.println("Login Succefully!!!");
			if(balance-amt>0)
			{
				balance =balance-amt;
				System.out.println("Withdraw Succefully!!!");
				System.out.println("Your Total Balance is : "+balance);
			}
			else
			{
				System.out.println("Insuifent balance");
			}
		}
		else
		{
				System.out.println("Incorrect Username or Password");
		}
	}


	public static void deposite(int pin,long acc,int amt)
	{
		if(ATMTran.acc==acc && ATMTran.pin==pin&&amt>0)
		{
			System.out.println("Amount Created Succefully!!!");
			balance =balance+amt;
			System.out.println("Deposited Succefully!!!");
			System.out.println("Your Total Balance is : "+balance);
		}
	
		else
		{
				System.out.println("Incorrect Username or Password");
		}
	}
	


}
