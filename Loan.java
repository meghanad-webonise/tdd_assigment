package calculator;

public class Loan {
	
	public double homeLoan(int p, int t)
	{
		double amnt= p*(1 + (8.20*t)/100);
		return amnt;
		
	}
	public double carLoan(int p, int t)
	{
		double amnt= p*(1 + (7.35*t)/100);
		return amnt;
	}
	
	public double personalLoan(int p, int t)
	{
		double amnt= p*(1 + (10.50*t)/100);
		return amnt;
		
	}

}
