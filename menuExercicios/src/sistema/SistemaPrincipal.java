package sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		do {
		System.out.println("Seja muito Bem vinda(o) ao menu de Exercícios de POO");
		System.out.println("\nEscolha o Menu desejado:\n[1] Lista Um\n[2] Lista Dois\n[3] Balanco Trimestral");
		try {
			opt = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Inválido!");
			sc.next();
			continue;
		}
		switch (opt) {
		case 1:
			exerciciosUm.ListaUm.menu();
			break;
		case 2:
			exerciciosDois.ListaDois.menu();
			break;
		case 3:
			balancoTrimestral.balanco.menu();
			break;
		}
	}while (true);
	}

}
