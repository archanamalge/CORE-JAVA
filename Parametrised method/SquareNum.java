class  SquareNum
{
	public static void main(String[] args) 
	{
		System.out.println(extract(225));
	}
	public static int extract(int num)
	{
		int sq=1;
		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			sq=num*num;
		}
		return sq;	
	}
	//public static int Sq(int num)

}
