class Wood{
	String type;
	int weight;
	float length;
	String color;
	String origin;
	
	Wood(String type)
	{
		System.out.println("invoking String const. of Wood");
	}
	
	Wood(String type, int weight)
	{
		this(type);
		System.out.println("invoking String,int const. of Wood");
	}
	
	
	Wood(String type, int weight, float length)
	{
		this(type, weight);
		System.out.println("invoking String,int, float const. of Wood");
	}
	
	Wood(String type, int weight, float length, String color)
	{
		this(type, weight,length);
		System.out.println("invoking String,int,float,String const. of Wood");
	}
	
	Wood(String type, int weight, float length, String color, String origin)
	{
		this(type, weight,length,color);
		System.out.println("invoking String,int,float,String,String const. of Wood");
		this.origin=origin;
	}
}