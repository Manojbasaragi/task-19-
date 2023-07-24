class Soil{
	String nutrient_level;
	String texture;
	static int pH;
	static String color;
	
	
	Soil(String nutrient_level, String texture){
		System.out.println("Invoking String,String Const. in Soil");
		this.nutrient_level=nutrient_level;
		this.texture=texture;
		
	}
	
	static{
		pH=5;
		color="Black";
	}
	
	void instaceSoil(){
		System.out.println("invoking instaceSoil() in Soil");
		System.out.println("Soil Nutrient Level is "+nutrient_level);
		System.out.println("Soil Texture is "+texture);
	}
	
	static void staticSoil(){
		System.out.println("Invoking staticSoil() in Soil");
		System.out.println("Soil pH is "+pH);
		System.out.println("Soil color is "+color);
		
	}
}