class NamePattern
{
	public static void main(String[] args)
	{
		int n1=4;
		int n2=29;
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(i==0&&j==1||j==0&&i==1||j==0&&i==2||j==0&&i==3||j==2&&i==1||j==2&&i==2||j==2&&i==3||i==2&&j==1||i==0&&j==4||i==0&&j==5||i==0&&j==6||j==4&&i==0||j==4&&i==1||j==4 &&i==1||j==4&&i==2||j==4&&i==3||i==1&&j==6||i==2&&j==5||i==3&&j==6||i==0&&j==9||i==0&&j==10||i==1&&j==8 ||i==2&&j==8||i==3&&j==9||i==3&&j==10||i==0&&j==12||i==1&&j==12||i==2&&j==12||i==3&&j==12||i==1&&j==13||i==0&&j==14||i==1&&j==14||i==2&&j==14||i==3&&j==14||i==0 &&j==17||i==1&&j==16||i==2&&j==16||i==3&&j==16||i==1&&j==18||i==2&&j==18||i==3&&j==18||i==2&&j==17||j==21&&i<=3||i==1&&j==22||j==23 &&i==2||j==24&&i<=3||i==0&&j==27||j==26&&i==1||j==26&&i==2||j==26&&i==3||j==28&&i==1||j==28&&i==2||j==28&&i==3||j==27&&i==2)
				{
					System.out.print("**"+" ");
				}
				
				else
				{
					System.out.print("  "+" ");
				}
			}
			System.out.println();
		}
	}
}
