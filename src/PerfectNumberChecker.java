
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
		if(numberToTest > 0 && numberToTest <= 10000) {
			return true;
		}
		return false;
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