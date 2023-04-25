package br.com.poo.exemplos;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BalancoTrimestralBigDecimal {
	private BigDecimal gastosJaneiro = new BigDecimal(15000.00);
	private BigDecimal gastosFevereiro = new BigDecimal(23000.00);
	private BigDecimal gastosMarco = new BigDecimal(17000.00);
	
	private BigDecimal soma = gastosJaneiro.add(gastosFevereiro);
	private BigDecimal somaTotal = soma.add(gastosMarco);
	
	public BigDecimal soma() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço trimestral total é: R$"+df.format(somaTotal));
		
		System.out.printf("O balanço trimestral total é: R$ %.2f",somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal gastosJaneiro) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO gasto de Janeiro é: R$"+df.format(gastosJaneiro));
		return gastosJaneiro;
	}
	
	public BigDecimal soma(BigDecimal gastosJaneiro, BigDecimal gastosFevereiro) {
		DecimalFormat df = new DecimalFormat("0.00");
		somaTotal = gastosJaneiro.add(gastosFevereiro);
		System.out.println("O gasto bimestral é: R$"+somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal gastosJaneiro, BigDecimal gastosFevereiro, BigDecimal gastosMarco) {
		DecimalFormat df = new DecimalFormat("0.00");
		somaTotal = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
		System.out.println("O gasto trimestral é: R$"+somaTotal);
		return somaTotal;
	}
}
