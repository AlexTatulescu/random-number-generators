package main;

import java.util.List;

import interfaces.IGenerator;

public class Evaluator {

	@SuppressWarnings("unused")
	private IGenerator generator;

	public Evaluator(IGenerator generator) {
		this.generator = generator;
	}

	public void evaluate(List<Float> numbers) {

		Integer counter = 0;
		Point origin = new Point(0, 0);

		for (Integer i = 0; i < numbers.size() - 2; i += 2) {
			Point point = new Point(numbers.get(i), numbers.get(i + 1));
			if (point.distanceTo(origin) < 1) {
				counter++;
			}
		}

		Double result = Math.PI - counter / (numbers.size() / 8);

		System.out.println("Raportul generat este: " + result);
	}

}
