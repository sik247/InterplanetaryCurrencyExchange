
public class Mars extends Currency {
	 public Mars(double totalFunds) { 
		 this.totalFunds = totalFunds; 
		 this.currencyName = "MarsMoney";
	 }
	 @Override
	 public double toEarthDollars(double amount) {
		double earthDollars = amount / MM; 
		return earthDollars; 
		
	 }
	 @Override
	 public double fromEarthDollars(double EarthDollars) { 
		 double currencyMars = EarthDollars * MM; 
		 return currencyMars;
	 }
	 
	  
	 
	
}
