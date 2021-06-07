package calculator;

public class Loan {
	
	public double homeLoan(int principle, int time)
	{
		double amnt= principle*(1 + (8.20*time)/100);
		return amnt;
		
	}
	public double carLoan(int principle, int time)
	{
		double amnt= principle*(1 + (7.35*time)/100);
		return amnt;
	}
	
	public double personalLoan(int principle, int time)
	{
		double amnt= principle*(1 + (10.50*time)/100);
		return amnt;
		
	}

}
