class RotatePrime 
{
	public static void main(String[] args) 
	{
		int num=113;
		System.out.println(rotate(num));
		int temp=num;

		while(num>0)
		{
			int last=num%10;
			num/=10;
		}


		if(isRotateP(num))
		{
			num=rotate(num);//311
			while(temp!=num)
			{
				if(!isRotateP(num))
				{
					break;
				}

			}
			System.out.println(num);
		}
	}
	public static boolean isRotateP(int num)
	{
		int rot=rotate(num);
		int den=2;
		/* if(num==rot)
		{
			System.out.println("It is Roteted Prime Number ");
		}
		else
		{
			System.out.println("It is Not Roteted Prime Number ");
		}*/
		return num==rot;
	}
	public static int rotate(int num)
	{
		int ct=count(num);
		return (num%10)*power(10,ct)+(num/=10);
	}
	public static int count(int num)
	{
		int ct=0;
		while(num>0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int last,int count)
	{
		int pow=1;
		for(int i=1;i<count;i++)
		{
			pow*=last;
		}
		//System.out.println(pow);
		return pow;
	}
	
}
