package org.formation.fonctionnelle;

import java.util.Iterator;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		int nombre = (int) (Math.random() * 10);
		int s = 0;
        int chiffre; 
		Scanner input = new Scanner(System.in);
		System.out.println("Choisissez un chiffre entre 0 et 9:");
        
		do {
			
			chiffre = input.nextInt();
			if (chiffre < nombre) {
				System.out.println("C'est plus");
			} else if (chiffre > nombre) {

				System.out.println("C'est moins");
			}
			s++;

		} while (chiffre != nombre);

		System.out.println("Bravo vous avez trouve en " + s + "essais");

		input.close();

	}

}
