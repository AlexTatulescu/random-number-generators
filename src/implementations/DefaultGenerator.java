package implementations;

import java.util.Random;

import interfaces.IGenerator;

public class DefaultGenerator implements IGenerator {

	private Random randomGenerator;

	public DefaultGenerator() {
		this.randomGenerator = new Random();
	}

	@Override
	public float next() {

		Float result = randomGenerator.nextFloat();
		return result;

	}

}
