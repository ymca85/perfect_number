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

}
