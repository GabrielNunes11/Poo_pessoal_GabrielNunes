package exerciciosUm;

import java.util.Scanner;

public class MiniCalculadora {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);

		String input1;
		String input2;
		int opt = 0;
		Double num1 = 0.0;
		Double num2 = 0.0;
		Double soma;
		Double subtracao;
		Double mult;
		Double div;

		while (true) {
			try {
				System.out.println("Número 1: ");
				input1 = sc.nextLine();
				num1 = Double.parseDouble(input1);
				break;
			} catch (NumberFormatException i1) {
				System.out.println("Inválido!");
			}
		}
		while (true) {
			try {
				System.out.println("Número 2: ");
				input2 = sc.nextLine();
				num2 = Double.parseDouble(input2);
				break;
			} catch (NumberFormatException i2) {
				System.out.println("Inválido!");
			}
		}
		if ((num1 * 10) % 10 == 0 || (num2 * 10) % 10 == 0) {
			Math.round(num1);
			Math.round(num2);
			if (true) {
				System.out.println("1 - Soma");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicação");
				System.out.println("4 - Divisão");
				System.out.println("Escolha a opção desejada: ");
				opt = sc.nextInt();
				switch (opt) {
				case 1:
					soma = num1 + num2;
					System.out.println("Número 1: " + num1);
					System.out.println("Número 2: " + num2);
					System.out.println("Soma: " + soma);
					break;
				case 2:
					subtracao = num1 - num2;
					System.out.println("Número 1: " + num1);
					System.out.println("Número 2: " + num2);
					System.out.println("Subtração: " + subtracao);
					break;
				case 3:
					mult = num1 * num2;
					System.out.println("Número 1: " + num1);
					System.out.println("Número 2: " + num2);
					System.out.println("Multiplicação: " + mult);
					break;
				case 4:
					div = num1 / num2;
					System.out.println("Número 1: " + num1);
					System.out.println("Número 2: " + num2);
					System.out.println("Divisão: " + div);
					break;
				default:
					System.out.println("Opção Inválida! Reinicie a Calculadora.");
					sc.close();
				}
			}
		}
	}
}
