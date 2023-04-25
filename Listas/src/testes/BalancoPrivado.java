package testes;

import java.util.Scanner;

public class BalancoPrivado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual mês você gostaria de inserir? ");
		GastosP.mes = sc.next(); 
		System.out.println(GastosP.mes);
		sc.close();
	}
}