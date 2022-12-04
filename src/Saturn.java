
public class Saturn extends Currency {
	public Saturn(double totalFunds) { 
		 this.totalFunds = totalFunds; 
		 this.currencyName = "SaturnSilver";
	 }
	 @Override
	 public double toEarthDollars(double amount) {
		double earthDollars = amount / SS; 
		return earthDollars; 
		
	 }
	 @Override
	 public double fromEarthDollars(double EarthDollars) { 
		 double currencyMars = EarthDollars * SS; 
		 return currencyMars;
	 }
}
