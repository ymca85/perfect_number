
public class PerfectNumberChecker {

	public boolean isPerfectNumber(int numberToTest) {
		if(isNumberPositive(numberToTest)) {
			return false;
		}
		return true;
	}

	private boolean isNumberPositive(int numberToTest) {
		return numberToTest < 0;
	}

}