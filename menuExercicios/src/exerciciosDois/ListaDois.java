package exerciciosDois;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ListaDois {

	public static void menu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int opt = 0;

		do {
			System.out.println("Seja muito Bem vinda(o) ao menu da Lista Dois");
			System.out.println("\nEscolha o Exercício desejado:\n[1] Siginificado da Vida, Universo e tudo mais"
					+ "\n[2] Sobre a Empresa Alterdata\n[3] Total de Produtos\n[4] Educado"
					+ "\n[5] Faço Parte\n[6] Mais que mil");
			try {
				opt = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Inválido!");
				sc.next();
				continue;
			}
			switch (opt) {
			case 1:
				exerciciosDois.SentidoDaVida.menu();
				break;
			case 2:
				exerciciosDois.Alterdata.menu();
				break;
			case 3:
				exerciciosDois.TotalProdutos.menu();
				break;
			case 4:
				exerciciosDois.Educado.menu();
				break;
			case 5:
				exerciciosDois.FacoParte.menu();
				break;
			case 6:
				exerciciosDois.MaisQueMil.menu();
				break;
			}
		} while (true);
	}
}
