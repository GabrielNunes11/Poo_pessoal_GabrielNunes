package br.com.poo.contas;

public class ContaPoupanca extends Conta implements DemaisOperacoes{
	private double rendimento;
	private String titular;
	
	public ContaPoupanca() {}

	public ContaPoupanca(String nome) {
		this.setTitular(nome);
	}
	
	@Override
	public void depositar(double valor) {
		System.out.println("Depositei na Poupança: R$");
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("Saquei na Poupança: R$");
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
}
