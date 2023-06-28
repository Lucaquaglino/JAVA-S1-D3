package Esercizio3;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;

		do {
			System.out.print("Inserisci una stringa (o \":q\" per uscire): ");
			input = scanner.nextLine();

			if (!input.equals(":q")) {
				StringBuilder output = new StringBuilder(); // creo oggetto di tipo stringbuilder per costruire la
															// stringa con le ,
				char[] chars = input.toCharArray(); // converto la stringa in un array di singoli caratteri con
													// tocharArray
				for (int i = 0; i < chars.length; i++) { // ciclo larray di caratteri e li aggiungo all oggetto
															// stringbuilder output
					output.append(chars[i]);
					if (i < chars.length - 1) { // metto la condizione che se l indice dell iterazione e inferiore all
												// ultimo indice dell array di stringhe aggiungo la ,
						output.append(",");
					}
				}
				System.out.println(output.toString()); // ricreo la stringa dall oggetto creato con il metodo toString
			}
		} while (!input.equals(":q"));

		System.out.println("Programma terminato.");
		scanner.close();
	}

}
