class CandleKiller{
	public static void main(String[] args){
		System.out.println("Running main in CandleRunner");
		
		Candle candle=new Candle(50,"Hammer");
		Candle.staticCandle();
		candle.instanceCandle();
		
		System.out.println("**************************************");
		Candle candle1=new Candle(30,"Doji");
		Candle.staticCandle();
		candle1.instanceCandle();
		
	}
}