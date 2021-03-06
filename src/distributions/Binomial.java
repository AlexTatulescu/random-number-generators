package distributions;

import java.util.Random;

import interfaces.IGenerator;

public class Binomial implements IGenerator {

	private Integer n;
	private Float p;
	private Random randomNumber;

	public Binomial(Integer n, Float p) {
		this.n = n;
		this.p = p;
		this.randomNumber = new Random();
	}

	@Override
	public float next() {

		Integer x = 0;
		Float u = 0f;
		for (Integer i = 0; i < n; i++) {
			u = randomNumber.nextFloat();
			if (u < p) {
				x++;
			}
		}

		Float result = (float) x / (n - 1);

		return result;
	}

}
