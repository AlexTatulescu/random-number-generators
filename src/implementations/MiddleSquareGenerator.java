package implementations;

import interfaces.IGenerator;

public class MiddleSquareGenerator implements IGenerator {

	private Integer seed;

	public MiddleSquareGenerator(Integer seed) {
		this.seed = seed;
	}

	@Override
	public void next() {

		Integer numberOfDigits = countDigits(seed);

		if (numberOfDigits % 2 == 0) {
			Integer nextNumber = ((seed * seed) / pow(10, numberOfDigits/2) % pow(10, numberOfDigits));
			seed = nextNumber;
			Float result = (float) nextNumber / pow(10, numberOfDigits);
			System.out.print(result + " ");
		}
	}

	public Integer countDigits(Integer number) {

		Integer counter = 0;

		while (number != 0) {
			number = number / 10;
			++counter;
		}

		return counter;
	}

	public Integer pow(Integer base, Integer power) {

		Integer result = 1;

		for (Integer i = 0; i < power; i++) {
			result = result * base;
		}

		return result;
	}

}
