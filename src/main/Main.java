package main;

import java.util.Scanner;

import distributions.Binomial;
import distributions.Poisson;
import implementations.DefaultGenerator;
import implementations.LinearCongruentialGenerator;
import implementations.MiddleSquareGenerator;
import interfaces.IGenerator;

public class Main {

	public static void main(String[] args) {

		IGenerator lng = new LinearCongruentialGenerator(27, 17, 43, 100);
		IGenerator msg = new MiddleSquareGenerator(5197);
		IGenerator defg = new DefaultGenerator();
		IGenerator poisson = new Poisson(100, 26.0);
		IGenerator binomial = new Binomial(10, 0.2f);

		Generate generate = new Generate();
		generate.run(lng);
		generate.run(msg);
		generate.run(defg);
		generate.run(poisson);
		generate.run(binomial);

		System.out.print("Introduceti cate puncte se vor folosi pentru evaluare: ");
		Scanner scanner = new Scanner(System.in);
		Integer numberOfPoints = scanner.nextInt();
		scanner.close();

		Evaluator evaluator1 = new Evaluator(defg);
		evaluator1.evaluate(numberOfPoints);

		Evaluator evaluator2 = new Evaluator(msg);
		evaluator2.evaluate(numberOfPoints);

		Evaluator evaluator3 = new Evaluator(lng);
		evaluator3.evaluate(numberOfPoints);
	}

}
