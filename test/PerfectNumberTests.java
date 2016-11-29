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
	public void testGetSumOfFactorsOfNumberForValueSix() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 6;
		assertTrue(perfectNumberChecker.getSumOfFactorsOfNumber(numberToTest) == numberToTest);
		
	}
	
	@Test
	public void testGetSumOfFactorsOfNumberForValueTwentyEight() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 28;
		assertTrue(perfectNumberChecker.getSumOfFactorsOfNumber(numberToTest) == numberToTest);
		
	}
	
	@Test
	public void testGetSumOfFactorsOfNumberForNonPerfectNumber() {
		
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		int numberToTest = 100;
		assertFalse(perfectNumberChecker.getSumOfFactorsOfNumber(numberToTest) == numberToTest);
		
	}
	
}
