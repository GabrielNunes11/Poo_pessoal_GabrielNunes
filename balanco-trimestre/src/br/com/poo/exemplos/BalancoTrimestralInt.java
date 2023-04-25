package br.com.poo.exemplos;

public class BalancoTrimestralInt {
	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	private int somaTotal = gastosJaneiro+
			gastosFevereiro + gastosMarco;
	
	public int soma() {
		System.out.println("O balanço trimestral total é: R$"+somaTotal);
		return somaTotal;
	}
	
	public int soma(int gastosJaneiro) {
		System.out.println("O gasto de Janeiro é: R$"+gastosJaneiro);
		return gastosJaneiro;
	}
	
	public int soma(int gastosJaneiro, int gastosFevereiro) {
		somaTotal = gastosJaneiro + gastosFevereiro;
		System.out.println("O gasto bimestral é: R$"+somaTotal);
		return somaTotal;
	}
	
	public int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco) {
		somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("O gasto trimestral é: R$"+somaTotal);
		return somaTotal;
	}
	
}