package main;

import implementations.DefaultGenerator;
import implementations.LinearCongruentialGenerator;
import implementations.MiddleSquareGenerator;
import interfaces.IGenerator;

public class Main {

	public static void main(String[] args) {

		IGenerator lng = new LinearCongruentialGenerator(27, 17, 43, 100);
		IGenerator msg = new MiddleSquareGenerator(9524);
		IGenerator defg = new DefaultGenerator();

		Generate generate = new Generate();
		generate.run(lng);
		generate.run(msg);
		generate.run(defg);

	}

}
