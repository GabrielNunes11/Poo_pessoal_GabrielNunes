package exerciciosUm;

import java.util.Scanner;

public class TempoVida {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int idade;
		int somaIdade = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a idade do " + i + "° colega: ");
			idade = sc.nextInt();
			somaIdade += idade;
		}
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		somaIdade += idade;
		sc.close();
		System.out.println("O tempo de vida meu e dos meus colegas é: " + somaIdade);
	}
}
