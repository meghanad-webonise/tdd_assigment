package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestLoan {
	Loan l=new Loan();

	@Test
	public void testHomeLoan() {
		
	assert(l.homeLoan(100, 5)==141);
	}
	
	@Test
	public void testHomeLoan1() {
		
	assert(l.homeLoan(200, 5)==282);
	}
	
	@Test
	public void testCarLoan() {
		assert(l.carLoan(100,5)==136.75);
	}

	@Test
	public void testPersonalLoan() {
		assert(l.personalLoan(200, 5)==305);
	}

}
