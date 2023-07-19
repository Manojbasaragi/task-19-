class DoorBell1
{
	String manufacturer;
	String originCountry;
	String modelNumber;
	int weight;
	int price;
	String color;
	String volume;
	
	DoorBell1(String manufacturer)
	{
		this.manufacturer=manufacturer;
	}
	
	DoorBell1(String manufacturer, String originCountry)
	{
		this.manufacturer=manufacturer;
		this.originCountry=originCountry;
	}
	
	DoorBell1(String manufacturer, String originCountry, String modelNumber)
	{
		this.manufacturer=manufacturer;
		this.originCountry=originCountry;
		this.modelNumber=modelNumber;
	}
	
	DoorBell1(String manufacturer, String originCountry, String modelNumber,int weight)
	{
		this.manufacturer=manufacturer;
		this.originCountry=originCountry;
		this.modelNumber=modelNumber;
		this.weight=weight;
	}
	
	DoorBell1(String manufacturer, String originCountry, String modelNumber,int weight, int price)
	{
		this.manufacturer=manufacturer;
		this.originCountry=originCountry;
		this.modelNumber=modelNumber;
		this.weight=weight;
		this.price=price;
	}
	
	DoorBell1(String manufacturer, String originCountry, String modelNumber,int weight, int price,String color)
	{
		this.manufacturer=manufacturer;
		this.originCountry=originCountry;
		this.modelNumber=modelNumber;
		this.weight=weight;
		this.price=price;
		this.color=color;
	}
	
	DoorBell1(String manufacturer, String originCountry, String modelNumber,int weight, int price,String color, String volume)
	{
		this.manufacturer=manufacturer;
		this.originCountry=originCountry;
		this.modelNumber=modelNumber;
		this.weight=weight;
		this.price=price;
		this.color=color;
		this.volume=volume;
	}
}
