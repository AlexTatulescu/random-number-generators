package implementations;

import data_structure.BinarySearchTree;
import interfaces.IGenerator;

public class LinearCongruentialGenerator implements IGenerator {

	private Integer seed;
	private Integer multiplier;
	private Integer increment;
	private Integer module;
	private BinarySearchTree bst;

	public LinearCongruentialGenerator(Integer seed, Integer multiplicator, Integer increment, Integer module) {
		this.seed = seed;
		this.multiplier = multiplicator;
		this.increment = increment;
		this.module = module;
		this.bst = new BinarySearchTree();
	}

	@Override
	public float next() {

		Integer nextNumber = (multiplier * seed + increment) % module;

		if (bst.find(nextNumber)) {
			nextNumber = nextNumber + 1;
		}
		
		bst.insert(nextNumber);

		seed = nextNumber;

		Float result = (float) nextNumber / module;

		return result;

	}

}
