package main;

import interfaces.IGenerator;

public class Evaluator {

	private IGenerator generator;

	public Evaluator(IGenerator generator) {
		this.generator = generator;
	}

	public double evaluate(Integer numberOfPoints) {

		Integer counter = 0;
		Point origin = new Point(0, 0);

		for (Integer i = 0; i < numberOfPoints; i++) {
			Point point = new Point(generator.next(), generator.next());
			if (point.distanceTo(origin) < 1) {
				counter++;
			}
		}

		System.out.println("Total puncte aflate in sfetul de cerc:" + counter);

		Double result = Math.PI - counter / (numberOfPoints / 4);

		System.out.println();
		System.out.println("Raportul generat este: " + result);

		return result;
	}

}
