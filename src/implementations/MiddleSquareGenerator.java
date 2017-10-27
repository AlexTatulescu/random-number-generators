package implementations;

import data_structure.BinarySearchTree;
import interfaces.IGenerator;

public class MiddleSquareGenerator implements IGenerator {

	private Integer seed = 0;
	private Integer numberOfDigits = 0;
	private BinarySearchTree bst;

	public MiddleSquareGenerator(Integer seed) {
		this.seed = seed;
		this.numberOfDigits = countDigits(seed);
		bst = new BinarySearchTree();
	}

	@Override
	public float next() {

		Integer nextNumber = 0;

		nextNumber = ((seed * seed) / pow(10, numberOfDigits / 2) % pow(10, numberOfDigits));

		if (bst.find(nextNumber)) {
			nextNumber = nextNumber + 1;
		}
		
		bst.insert(nextNumber);

		if (nextNumber < pow(10, numberOfDigits - 1)) {
			nextNumber = nextNumber + pow(10, numberOfDigits - 1);
		}

		seed = nextNumber;

		Float result = (float) nextNumber / pow(10, numberOfDigits);

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
