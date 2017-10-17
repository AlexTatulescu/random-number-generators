package implementations;

import interfaces.IGenerator;

public class MiddleSquareGenerator implements IGenerator {

	private int seed;

	public MiddleSquareGenerator(int seed) {
		this.seed = seed;
	}

	@Override
	public void next() {
		int numberOfDigits = countDigits(seed);
		if (numberOfDigits % 2 == 0) {
			double nextNumber = (seed * seed) / Math.pow(10, numberOfDigits);
		}
	}

	public int countDigits(int number) {
		int counter = 0;
		while (number != 0) {
			number = number / 10;
			++counter;
		}
		return counter;
	}

}
