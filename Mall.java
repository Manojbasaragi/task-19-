class Mall
{
	String name;
	String owner;
	String location;
	int noOfFloors;
	int noOfShops;
	int yearEstablished;
	boolean parkingCapacity;
	
	Mall(String name)
	{
		System.out.println("Invoking String Const. of Mall");
	}
	
	Mall(String name, String owner)
	{
		this(name);
		System.out.println("Invoking String,String Const. of Mall");
	}
	
	Mall(String name, String owner,String location)
	{
		this(name,owner);
		System.out.println("Invoking String,String,String Const. of Mall");
	}
	
	Mall(String name, String owner,String location, int noOfFloors)
	{
		this(name,owner,location);
		System.out.println("Invoking String,String,String,int Const. of Mall");
	}
	
	Mall(String name, String owner,String location, int noOfFloors, int noOfShops)
	{
		this(name,owner,location,noOfFloors);
		System.out.println("Invoking String,String,String,int,int Const. of Mall");
	}
	
	Mall(String name, String owner,String location, int noOfFloors, int noOfShops, int yearEstablished)
	{
		this(name,owner,location,noOfFloors,noOfShops);
		System.out.println("Invoking String,String,String,int,int,int Const. of Mall");
	}
	
	Mall(String name, String owner,String location, int noOfFloors, int noOfShops, int yearEstablished, boolean parkingCapacity)
	{
		this(name,owner,location,noOfFloors,noOfShops,yearEstablished);
		System.out.println("Invoking String,String,String,int,int,int,boolean Const. of Mall");
		this.parkingCapacity=parkingCapacity;
	}
}
