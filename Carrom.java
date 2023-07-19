class Carrom
{
	String brand;
	String material;
	String color;
	int noOfPlayers;
	int noOfPockets;
	
	Carrom(String brand)
	{
		this.brand=brand;
	}
	
	
	Carrom(String brand, String material)
	{
		this.brand=brand;
		this.material=material;
	}
	
	
	Carrom(String brand, String material, String color)
	{
		this.brand=brand;
		this.material=material;
		this.color=color;
	}
	
	Carrom(String brand, String material, String color, int noOfPlayers)
	{
		this.brand=brand;
		this.material=material;
		this.color=color;
		this.noOfPlayers=noOfPlayers;
	}
	
	Carrom(String brand, String material, String color, int noOfPlayers, int noOfPockets)
	{
		this.brand=brand;
		this.material=material;
		this.color=color;
		this.noOfPlayers=noOfPlayers;
		this.noOfPockets=noOfPockets;
	}
}