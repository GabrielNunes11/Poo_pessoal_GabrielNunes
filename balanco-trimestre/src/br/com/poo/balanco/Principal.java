package br.com.poo.balanco;

import java.math.BigDecimal;

import br.com.poo.exemplos.BalancoTrimestralBigDecimal;
import br.com.poo.exemplos.BalancoTrimestralDouble;
import br.com.poo.exemplos.BalancoTrimestralInt;

public class Principal {

	public static void main(String[] args) {
		/*//Balanço Inteiro
		BalancoTrimestralInt bti = new BalancoTrimestralInt();
		bti.soma();
		bti.soma(10);
		bti.soma(500, 100);
		bti.soma(200, 1000, 50000);
		
	//Balanço Double
		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
		btd.soma();
		btd.soma(10);
		btd.soma(500, 100);
		btd.soma(200, 1000, 50000);*/
		
	//Balanço BigDecimal
		BalancoTrimestralBigDecimal btbd = new BalancoTrimestralBigDecimal();
		btbd.soma();
		btbd.soma(new BigDecimal(10));
		btbd.soma(new BigDecimal(500.0),new BigDecimal(100.0));
		btbd.soma(new BigDecimal(200.0),new BigDecimal(1000.0),new BigDecimal(50000.0));
	}

}
