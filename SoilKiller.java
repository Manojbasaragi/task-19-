class SoilKiller{
	public static void main(String[] args)
	{
		Soil soil = new Soil("Nitrogen","Sandy");
		soil.instaceSoil();
		Soil.staticSoil();
		System.out.println("***********************************");
		
		Soil soil1 = new Soil("Phosperous","Clayey");
		soil.instaceSoil();
		Soil.staticSoil();
	}
}