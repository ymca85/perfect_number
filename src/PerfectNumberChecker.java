
public class PerfectNumberChecker {

	private final int NUMBER_ZERO = 0;

	public boolean isPerfectNumber(int numberToTest) {
		if (isNumberValidToCheck(numberToTest)) {
			return false;
		}
		return (numberToTest == getSumOfFactorsOfNumber(numberToTest));
	}

	private boolean isNumberValidToCheck(int numberToTest) {
		return numberToTest < NUMBER_ZERO;
	}

	public int getSumOfFactorsOfNumber(int numberToTest) {

		int sumOfFactorsOfNumber = 1;

		for (int i = 2; i <= (numberToTest / 2); i++) {
			if (numberToTest % i == 0) {
				sumOfFactorsOfNumber = sumOfFactorsOfNumber + i;
			}
		}
		return sumOfFactorsOfNumber;
	}

}