package exerciciosDois;

import java.util.Scanner;

public class Educado {
	
	public static void menu() {
		String nome, apelido;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o seu nome? ");
		nome = sc.next();
		System.out.println("Como que você gostaria de ser chamada(o)? ");
		apelido = sc.next();
		System.out.println("Seja muito Bem vinda(o), " + nome + ", ou melhor, " + apelido + "!");
		sc.close();
	}
}
