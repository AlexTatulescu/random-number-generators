package implementations;

import interfaces.IGenerator;

public class LinearCongruentialGenerator implements IGenerator {
	
	private int seed;
	private int multiplier;
	private int increment;
	private int module;
	private int limit;
	
	

	public LinearCongruentialGenerator(int seed, int multiplicator, int increment, int module, int limit) {
		this.seed = seed;
		this.multiplier = multiplicator;
		this.increment = increment;
		this.module = module;
		this.limit = limit;
	}

	@Override
	public void next() {
		System.out.println("Secventa de numere este: ");
		for(int i = 1; i <= limit; i++){
			int nextNumber = (multiplier * seed + increment) % module;
			seed = nextNumber;
			System.out.println("x" + i + " = " + nextNumber);
		}
	}
	
}
