
public class PerfectNumberChecker {

	private final int NUMBER_ZERO = 0;

	public boolean isPerfectNumber(int numberToTest) {
		if(isNumberPositive(numberToTest)) {
			return false;
		}
		return true;
	}

	private boolean isNumberPositive(int numberToTest) {
		return numberToTest < NUMBER_ZERO;
	}

	public int getSumOfFactorsOfNumber(int numberToTest) {
		return 0;
	}

}