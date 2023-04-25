package br.com.poo.exemplos;

public class BalancoTrimestralDouble {
	private double gastosJaneiro = 15000.0;
	private double gastosFevereiro = 23000.0;
	private double gastosMarco = 17000.0;
	private double somaTotal = gastosJaneiro+
				gastosFevereiro + gastosMarco;
	
	public double soma() {
		System.out.println("O balanço trimestral total é: R$"+somaTotal);
		return somaTotal;
	}
	
	public double soma(double gastosJaneiro) {
		System.out.println("O gasto de Janeiro é: R$"+gastosJaneiro);
		return gastosJaneiro;
	}
	
	public double soma(double gastosJaneiro, double gastosFevereiro) {
		somaTotal = gastosJaneiro + gastosFevereiro;
		System.out.println("O gasto bimestral é: R$"+somaTotal);
		return somaTotal;
	}
	
	public double soma(double gastosJaneiro, double gastosFevereiro, double gastosMarco) {
		somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("O gasto trimestral é: R$"+somaTotal);
		return somaTotal;
	}
}
