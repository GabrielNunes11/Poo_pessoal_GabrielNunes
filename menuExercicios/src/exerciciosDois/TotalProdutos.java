package exerciciosDois;

import java.util.Scanner;

public class TotalProdutos {
	
	public static void menu() {
		int prod;
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor digite quantos produtos você quer comprar no total: ");
		prod = sc.nextInt();
		System.out.println("Parabéns por comprar " + prod + " produtos!");
		sc.close();
	}
}
