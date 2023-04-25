package listaum;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean verificacao = true;
		String input1;
		String input2;
		Double num1 = 0.0;
		Double num2 = 0.0;
		Double soma;
		Double subtracao;
		Double mult;
		Double  div; 
		
		while (verificacao = true) {
			try {
				System.out.println("Número 1: ");
				input1 = sc.nextLine();
				num1 = Double.parseDouble(input1);
				break;
			} catch(NumberFormatException e) {
				System.out.println("Inválido!");
			}
		}
		
		while (verificacao = true) {
			try {
				System.out.println("Número 2: ");
				input2 = sc.nextLine();
				num2 = Double.parseDouble(input2);
				break;
			} catch(NumberFormatException e) {
				System.out.println("Inválido!");
			}
		} if (verificacao = true) {
			soma = num1 + num2;
			subtracao = num1 - num2;
			mult = num1 * num2;
			div = num1 / num2;
			System.out.println("Número 1: "+num1);
			System.out.println("Número 2: "+num2);
			System.out.println("Soma: "+soma);
			System.out.println("Subtração: "+subtracao);
			System.out.println("Multiplicação: "+mult);
			System.out.println("Divisão: "+div);
		}
		sc.close();
	}
}
