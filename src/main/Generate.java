package main;

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
	
	public void run(IGenerator generator){
		
		System.out.println("Secventa de numere generate este: ");
		
		for (Integer i = 0; i < counter; i++) {
			generator.next();
		}
		
		System.out.println();
		
	}

}
