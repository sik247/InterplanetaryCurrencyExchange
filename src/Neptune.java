
public class Neptune extends Currency {
	public Neptune(double totalFunds) { 
		 this.totalFunds = totalFunds; 
		 this.currencyName = "NeptuneNuggets";
	 }
	 @Override
	 public double toEarthDollars(double amount) {
		double earthDollars = amount / NN; 
		return earthDollars; 
		
	 }
	 @Override
	 public double fromEarthDollars(double EarthDollars) { 
		 double currencyMars = EarthDollars * NN; 
		 return currencyMars;
	 }
}
