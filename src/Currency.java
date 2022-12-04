//filled in data types or methods
public abstract class Currency implements Exchangeable{
	public String currencyName; //
	public double totalFunds; 
	public abstract double toEarthDollars(double amount);
	public abstract double fromEarthDollars(double EarthDollars);
	
	public void exchange(Currency other, double amount) { 
		//see which planet it is and convert
		if (this.totalFunds < amount ) {
			System.out.println("uh oh ");
		}
		this.totalFunds = this.totalFunds - amount; 
		double x = this.toEarthDollars(amount);
		double received = other.fromEarthDollars(x); 
		other.totalFunds = other.totalFunds + received; 
		
		// coverting from" +this.currencyName + to + other.CurrencyName 
		
		
		
		//this recieves money other.currencyName; 
	}
}
