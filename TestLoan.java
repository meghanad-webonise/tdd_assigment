package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestLoan {
	Loan loan=new Loan();

	@Test
	public void testHomeLoan() {
		
	assert(loan.homeLoan(100, 5)==141);
	}
	

	
	@Test
	public void testCarLoan() {
		assert(loan.carLoan(100,5)==136.75);
	}

	@Test
	public void testPersonalLoan() {
		assert(loan.personalLoan(200, 5)==305);
	}

}
