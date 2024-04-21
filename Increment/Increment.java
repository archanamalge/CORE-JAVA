class Increment
{
	public static void main(String[] args)
	{
		int pocket=50;

		System.out.println(++pocket);//51     51

		System.out.println(++pocket);//52 		52

		System.out.println(pocket++);//52		53

		System.out.println(++pocket);//54		54

		System.out.println(pocket++);//54  		55

		System.out.println(++pocket + pocket++);//110 		56  	57

		System.out.println(pocket );//57     57

		System.out.println(pocket++ - ++pocket);//-2		58    59

		System.out.println(pocket);//112   59
	}
}
