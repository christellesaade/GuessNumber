package org.formation.fonctionnelle;

import java.util.Scanner;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		
		int nombre1 = (int) (Math.random() * 1000);
		int nombre2 = (int) (Math.random() * 1000);
		int nombre3 = (int) (Math.random() * 1000);
		int s=0;
        
		do {
			 nombre1 = (int) (Math.random() * 1000);
			 nombre2 = (int) (Math.random() * 1000);
			 nombre3 = (int) (Math.random() * 1000);
			 s++;
			 
			} while !(nombre1 % 2 == 0) || !(nombre2 % 2 ==0) || !(nombre3 % 2 != 0);

		System.out.println(nombre1 +" "+ nombre2+" "+ nombre3+" "+ s);


	}

}
