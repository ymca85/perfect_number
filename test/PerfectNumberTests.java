import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectNumberTests {

	@Test
	public void testIsPerfectNumber() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 6;
		assertTrue(perfectNumberChecker.isPerfectNumber(numberToTest));
		
	}
	
	@Test
	public void testIsPerfectNumberForNegativeNumber() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = -6;
		assertFalse(perfectNumberChecker.isPerfectNumber(numberToTest));
		
	}
	
	@Test
	public void testIsPerfectNumberForNumberOutOfRange() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 33550336;
		assertFalse(perfectNumberChecker.isPerfectNumber(numberToTest));
		
	}
	
	@Test
	public void testIsPerfectNumberForNumberZero() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 0;
		assertFalse(perfectNumberChecker.isPerfectNumber(numberToTest));
		
	}
	
	@Test
	public void testIsPerfectNumberForNumberOne() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 1;
		assertFalse(perfectNumberChecker.isPerfectNumber(numberToTest));
		
	}
	
	@Test
	public void testGetSumOfFactorsOfNumber() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 6;
		assertTrue(perfectNumberChecker.getSumOfFactorsOfNumber(numberToTest) > 0);
		
	}
	
}
