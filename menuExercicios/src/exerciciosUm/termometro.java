package exerciciosUm;

import java.util.Scanner;

public class termometro {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		double celsius;
		double soma;

		System.out.println("Digite a temperatura em Celsius °C: ");
		celsius = sc.nextInt();
		System.out.println("Temperatura em Celsius °C: " + celsius);
		soma = celsius * 1.8 + 32;
		System.out.println("Temperatura em Fahrenheit °F: " + soma);
		sc.close();
	}
}
