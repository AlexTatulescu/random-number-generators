package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.IGenerator;

public class Generate {

	Integer counter;

	public Generate() {

		System.out.print("Introduceti cate numere doriti sa generati: ");
		Scanner scanner = new Scanner(System.in);
		this.counter = scanner.nextInt();
		scanner.close();

	}

	public List<Float> run(IGenerator generator) {

		System.out.println("Secventa de numere generate este: ");

		List<Float> generatedNumbers = new ArrayList<>();

		for (Integer i = 0; i < counter; i++) {
			generatedNumbers.add(generator.next());
		}

		System.out.println();

		return generatedNumbers;

	}

}
