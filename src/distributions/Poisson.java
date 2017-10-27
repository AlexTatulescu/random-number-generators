package distributions;

import java.util.Random;

import interfaces.IGenerator;

public class Poisson implements IGenerator {

	private Integer k;
	private Float p;
	private Random randomNumber;
	private Float L;
	@SuppressWarnings("unused")
	private Float lambda;
	private Integer n;

	public Poisson(Integer n, Float lambda) {
		this.k = 0;
		this.p = 1f;
		this.n = n;
		this.lambda = lambda;
		this.randomNumber = new Random();
		this.L = (float) Math.pow(Math.E, lambda);
	}

	@Override
	public float next() {
		do {
			k++;
			p = p * randomNumber.nextFloat();
		} while (p > L && k <= n);

		Integer result = (k - 1) / (n);

		return result;
	}

}
