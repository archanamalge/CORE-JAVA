class Bin_To_Dec 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int num=10;
		conver(num);
	}
	public static String conver(int num)
	{
		String bin="1111";
		int sum=0;
		int i=0;
		for(i=0;num!=0;i++,num/=10)
		{
			int last=bin%10;
			sum=sum+(last*power(2,i));
			bin++;
			bin/=10;
		}
		return sum; 
	}
	public static int power(int num,int i)
	{
		int pow=1;
		for(int j=0;j<i;j++)
		{
			pow*=i;
			System.out.println(pow);
		}
		return pow;
	}
}
