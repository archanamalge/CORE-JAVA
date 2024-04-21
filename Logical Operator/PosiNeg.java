class PosiNeg
{
	public static void main(String[] args)
	{
		int num=-3;
		//String ans=(num>0 || num <0)? "It is Postive Number" : "It is Negative Number";
		boolean ans1=(num>0 && num >=0);
		boolean ans2=(!(num>0));

		//System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}
}

		