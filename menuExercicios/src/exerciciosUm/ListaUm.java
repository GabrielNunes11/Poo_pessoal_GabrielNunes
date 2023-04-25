package exerciciosUm;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ListaUm {
	
	public static void menu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int opt = 0;
		
		do {
		System.out.println("Seja muito Bem vinda(o) ao menu da Lista Um");
		System.out.println("\nEscolha o Exercício desejado:\n[1] Bem vindo\n[2] Tempo de Vida\n[3] Mini Calculadora"
				+ "\n[4] Termometro\n[5] Riuju A\n[6] Riuju B");
		try {
			opt = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Inválido!");
			sc.next();
			continue;
		}
		switch(opt) {
		case 1:
			exerciciosUm.BemVindo.menu();
			break;
		case 2:
			exerciciosUm.TempoVida.menu();
			break;
		case 3:
			exerciciosUm.MiniCalculadora.menu();
			break;
		case 4:
			exerciciosUm.termometro.menu();
			break;
		case 5:
			exerciciosUm.riujuA.menu();
		case 6:
			exerciciosUm.riujuB.menu();
			break;
		}
		}while(true);
	}
}
