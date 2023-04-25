package exerciciosUm;

import java.util.Scanner;

public class BemVindo {
	
	public static void menu() {
		String nome, sobrenome;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome? ");
		nome = sc.nextLine();
		System.out.println("Digite seu sobrenome? ");
		sobrenome = sc.nextLine();
		sc.close();
		System.out.println("Olá " + nome + " " + sobrenome + "," + "seja bem-vinda(o) ao universo da programação)");
	}
	
}
