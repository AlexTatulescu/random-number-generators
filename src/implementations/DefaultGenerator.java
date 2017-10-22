package implementations;

import java.util.Random;

import interfaces.IGenerator;

public class DefaultGenerator implements IGenerator {
	
	private Random randomGenerator;

	public DefaultGenerator() {
		this.randomGenerator = new Random();
	}

	@Override
	public void next() {
		Float result = randomGenerator.nextFloat();
		System.out.print(result + " ");
	}

}
