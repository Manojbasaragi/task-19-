class AllAreHere{
	public static void main(String[] values)
	{
		System.out.println("Invoking main in AllAreHere");
		
		Wood wood = new Wood("Shrigandha",250,25.5f,"Brown","Forest");
		System.out.println("==================================================");
		Wood wood1 = new Wood("Shrigandha",500,150);
		System.out.println("==================================================");
		Wood wood2 = new Wood("Shrigandha",600);
		System.out.println("**************************************************");
		
		Mall mall = new Mall("Oraien Mall","Prajwal","Bengalore",5,200,2010,true);
		System.out.println("==================================================");
		Mall mall1 = new Mall("D-mall","Rahul","Bagalkot");
		System.out.println("==================================================");
		Mall mall2 =new Mall("calre-Mall","Wangan");
		System.out.println("**************************************************");
		
		Park park = new Park("Gopika","Hubballi",50,200,2001,true,100,9,5);
		System.out.println("==================================================");
		Park park1 = new Park("Super-Park","Davangere",50);
		System.out.println("==================================================");
		Park park2 = new Park("National-Park","Tumkuru");
	}
}