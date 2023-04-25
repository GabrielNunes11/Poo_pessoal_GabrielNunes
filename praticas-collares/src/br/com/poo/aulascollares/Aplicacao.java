package br.com.poo.aulascollares;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.contas.ContaPoupanca;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("Banco Residência");
		
		/*Conta conta = new Conta();
		conta.agencia = 1;
		conta.setTitular("Maria Teresa");
		System.out.println("Parabéns, "+conta.getTitular()+" sua conta foi aberta!");
		System.out.println("Sua agência é: "+conta.agencia);
		
		Conta conta2 = new Conta("Marcello Collares");
		System.out.println("Parabéns, "+conta2.getTitular()+" sua conta foi aberta!");
		System.out.println("Sua agência é: "+conta2.agencia);*/
		
//		ContaPoupanca poupanca = new ContaPoupanca("Marcello Collares");
//		System.out.println("Parabéns, "+poupanca.getTitular()+" sua conta foi aberta!");
//		poupanca.setRendimento(10);
//		System.out.println("Seu rendimento é de: "+poupanca.getRendimento()+" por cento.");
//		poupanca.depositar(100);
//		System.out.println("Saldo é de: "+poupanca.getSaldo());
//		poupanca.sacar(20);
//		System.out.println("Saldo é de: "+poupanca.getSaldo());
		
		Conta conta;
		conta = new ContaPoupanca();
		conta.sacar(10.0);

		conta = new ContaCorrente();
		conta.sacar(10.0);
		
	}

}
