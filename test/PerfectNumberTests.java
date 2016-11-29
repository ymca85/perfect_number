import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectNumberTests {

	@Test
	public void testPerfectNumber() {
		
		PerfectNumber perfectNumber = new PerfectNumber();
		int numberToTest = 6;
		assertTrue(perfectNumber.isPerfectNumber(numberToTest));
		
	}

}
