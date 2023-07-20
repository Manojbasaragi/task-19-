class Park{
	String name;
	String location;
	double entryFees;
	int noOfTrees;
	int yeraOFEstablished;
	boolean playGround;
	int noOfVisitors;
	int openTime;
	int closeTime;
	
	
	Park(String name)
	{
		System.out.println("Invoking String Const. of Park ");
	}
	
	Park(String name, String location)
	{
		this(name);
		System.out.println("Invoking String,String Const. of Park ");
	}
	
	
	Park(String name, String location, double entryFees)
	{
		this(name, location);
		System.out.println("Invoking String,String,double Const. of Park ");
	}
	
	Park(String name, String location, double entryFees, int noOfTrees)
	{
		this(name, location, entryFees);
		System.out.println("Invoking String,String,double,int Const. of Park ");
	}
	
	Park(String name, String location, double entryFees, int noOfTrees, int yeraOFEstablished)
	{
		this(name, location, entryFees,noOfTrees);
		System.out.println("Invoking String,String,double,int,int Const. of Park ");
	}
	
	Park(String name, String location, double entryFees, int noOfTrees, int yeraOFEstablished, boolean playGround)
	{
		this(name, location, entryFees,noOfTrees, yeraOFEstablished);
		System.out.println("Invoking String,String,double,int,int,boolean Const. of Park ");
	}
	
	Park(String name, String location, double entryFees, int noOfTrees, int yeraOFEstablished, boolean playGround, int noOfVisitors)
	{
		this(name, location, entryFees,noOfTrees, yeraOFEstablished, playGround);
		System.out.println("Invoking String,String,double,int,int,boolean,int Const. of Park ");
	}
	
	Park(String name, String location, double entryFees, int noOfTrees, int yeraOFEstablished, boolean playGround, int noOfVisitors, int openTime)
	{
		this(name, location, entryFees,noOfTrees, yeraOFEstablished, playGround, noOfVisitors);
		System.out.println("Invoking String,String,double,int,int,boolean,int,int Const. of Park ");
	}
	
	Park(String name, String location, double entryFees, int noOfTrees, int yeraOFEstablished, boolean playGround, int noOfVisitors, int openTime, int closeTime)
	{
		this(name, location, entryFees,noOfTrees, yeraOFEstablished, playGround, noOfVisitors,openTime);
		System.out.println("Invoking String,String,double,int,int,boolean,int,int,int Const. of Park ");
		this.closeTime=closeTime;
	}
}