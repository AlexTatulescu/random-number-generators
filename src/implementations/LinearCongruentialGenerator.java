package implementations;

import interfaces.IGenerator;

public class LinearCongruentialGenerator implements IGenerator {
	
	private Integer seed;
	private Integer multiplier;
	private Integer increment;
	private Integer module;

	public LinearCongruentialGenerator(Integer seed, Integer multiplicator, Integer increment, Integer module) {
		this.seed = seed;
		this.multiplier = multiplicator;
		this.increment = increment;
		this.module = module;
	}

	@Override
	public float next() {
			Integer nextNumber = (multiplier * seed + increment) % module;
			seed = nextNumber;
			Float result = (float) nextNumber / module;
			System.out.print(result + " ");
			
			return result;
	}
	
}
