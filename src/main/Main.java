package main;

import java.util.Scanner;

import implementations.DefaultGenerator;
import implementations.LinearCongruentialGenerator;
import implementations.MiddleSquareGenerator;
import interfaces.IGenerator;

public class Main {

	public static void main(String[] args) {

		IGenerator lng = new LinearCongruentialGenerator(27, 17, 43, 100);
		IGenerator msg = new MiddleSquareGenerator(5197);
		IGenerator defg = new DefaultGenerator();

		System.out.print("Introduceti cate puncte se vor folosi pentru evaluare: ");

		Scanner scanner = new Scanner(System.in);
		Integer numberOfPoints = scanner.nextInt();
		scanner.close();

		Evaluator evaluator = new Evaluator(defg);
		evaluator.evaluate(numberOfPoints);
	}

}
