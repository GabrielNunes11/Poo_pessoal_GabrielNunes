package testes;

public class BalancoTrimestral {

	public static void main(String[] args) {
		double gastosTrimestre;
		
		gastosTrimestre = Gastos.gastosJaneiro + Gastos.gastosFevereiro + Gastos.gastosMarco;
		System.out.println("Gasto Trimestral: R$"+gastosTrimestre);
	}
}