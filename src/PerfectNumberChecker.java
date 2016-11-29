
public class PerfectNumberChecker {

	public static void main(String[] args) {

		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
		System.out.println(perfectNumberChecker.isPerfectNumber(Integer.parseInt(args[0])));
	}

	public boolean isPerfectNumber(int numberToTest) {
		if (!isNumberValidToCheck(numberToTest)) {
			return false;
		}
		return (numberToTest == getSumOfFactorsOfNumber(numberToTest));
	}

	private boolean isNumberValidToCheck(int numberToTest) {
		return numberToTest > 0;
	}

	public int getSumOfFactorsOfNumber(int numberToTest) {

		int sumOfFactorsOfNumber = 0;

		for (int i = 1; i <= (numberToTest / 2); i++) {
			if (numberToTest % i == 0) {
				sumOfFactorsOfNumber = sumOfFactorsOfNumber + i;
			}
		}
		return sumOfFactorsOfNumber;
	}

}