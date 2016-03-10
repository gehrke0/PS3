package base;

public class InsufficientFundsException extends Exception{
	private double funds;
	   public void InsufficientFundsException(double funds)
	   {
	      this.funds = funds;
	   } 
	   public double getFunds()
	   {
	      return funds;
	   }
}
