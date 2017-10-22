package implementations;

import interfaces.IGenerator;

public class MiddleSquareGenerator implements IGenerator {

	private Integer seed;
	private Integer numberOfDigits;

	public MiddleSquareGenerator(Integer seed) {
		this.seed = seed;
		this.numberOfDigits = countDigits(seed);
	}

	@Override
	public float next() {

		Integer nextNumber = 0;

		nextNumber = ((seed * seed) / pow(10, numberOfDigits / 2) % pow(10, numberOfDigits));
		if (countDigits(nextNumber) < numberOfDigits) {
			nextNumber = nextNumber + pow(10, numberOfDigits - 1);
		}

		if (seed == nextNumber) {
			seed = nextNumber + numberOfDigits;
		} else {
			seed = nextNumber;
		}
		
		Float result = (float) nextNumber / pow(10, numberOfDigits);
		System.out.print(result + " ");
		
		return result;

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
