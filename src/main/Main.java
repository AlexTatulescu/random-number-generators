package main;

import implementations.LinearCongruentialGenerator;
import interfaces.IGenerator;

public class Main {

	public static void main(String[] args) {
		
		IGenerator lng = new LinearCongruentialGenerator(27, 17, 43, 100, 10);
		lng.next();

	}

}
